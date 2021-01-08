package com.lmhd.common.util;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangqian on 2019/3/12.
 */
@Configuration
@ConditionalOnProperty(prefix = "oss.aliyun", value = "endpoint")
public class OSSUtils {

	private static Logger _log = LoggerFactory.getLogger(OSSUtils.class);
	public static  String endpoint;
	public static  String accessKeyId;
	public static  String accessKeySecret;
	public static  String bucketName;
	public static  String bucketNameDomain;
	public static  String filePrefix;

	@Value("${oss.aliyun.endpoint:#{null}}")
	public void setEndpoint(String endpoint) {
		OSSUtils.endpoint = endpoint;
	}

	@Value("${oss.aliyun.accessKeyId:#{null}}")
	public void setAccessKeyId(String accessKeyId) {
		OSSUtils.accessKeyId = accessKeyId;
	}

	@Value("${oss.aliyun.accessKeySecret:#{null}}")
	public void setAccessKeySecret(String accessKeySecret) {
		OSSUtils.accessKeySecret = accessKeySecret;
	}

	@Value("${oss.aliyun.bucketName:#{null}}")
	public void setBucketName(String bucketName) {
		OSSUtils.bucketName = bucketName;
	}

	@Value("${oss.aliyun.bucketNameDomain:#{null}}")
	public void setBucketNameDomain(String bucketNameDomain) {
		OSSUtils.bucketNameDomain = bucketNameDomain;
	}

	@Value("${oss.aliyun.filePrefix:#{null}}")
	public void setFilePrefix(String filePrefix) {
		OSSUtils.filePrefix = filePrefix;
	}

	public List<JSONObject> page(String keyPrefix, int offset, int limit) {
		List<JSONObject> jsonObjects = new ArrayList<>();
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		List<OSSObjectSummary> objectSummaries = new ArrayList<>();
		if (offset == 0) {
			ObjectListing objectListing = ossClient.listObjects(new ListObjectsRequest(bucketName).withPrefix(keyPrefix).withMarker(null).withMaxKeys(limit));
			objectSummaries = objectListing.getObjectSummaries();
		} else {
			ObjectListing objectListingTemp = ossClient.listObjects(new ListObjectsRequest(bucketName).withMaxKeys(offset).withPrefix(keyPrefix).withMarker(null));
			List<OSSObjectSummary> objectSummariesTemp = objectListingTemp.getObjectSummaries();
			if (objectSummariesTemp != null && objectSummariesTemp.size() > 0) {
				OSSObjectSummary ossObjectSummaryTemp = objectSummariesTemp.get(objectSummariesTemp.size() - 1);
				String marker = ossObjectSummaryTemp.getKey();
				ObjectListing objectListing = ossClient.listObjects(new ListObjectsRequest(bucketName).withMaxKeys(limit).withPrefix(keyPrefix).withMarker(marker));
				objectSummaries = objectListing.getObjectSummaries();
			}
		}
		objectSummaries.forEach(object -> {
			System.out.println(object.getKey());
			String name = object.getKey();
			String url = bucketNameDomain + name;
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("key", name);
			jsonObject.put("url", url);
			jsonObjects.add(jsonObject);
		});
		ossClient.shutdown();
		return jsonObjects;
	}

	public int count(String keyPrefix) {
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		String nextMarker = null;
		int limit = 100;
		int count = 0;
		ObjectListing objectListing = null;
		do {
			objectListing = ossClient.listObjects(new ListObjectsRequest(bucketName).withPrefix(keyPrefix).withMarker(nextMarker).withMaxKeys(limit));
			List<OSSObjectSummary> objectSummaries = objectListing.getObjectSummaries();
			count += objectSummaries.size();
			nextMarker = objectListing.getNextMarker();
		} while (objectListing.isTruncated());
		ossClient.shutdown();
		return count;
	}

	/**
	 * 断点续传上传文件到OSS
	 *
	 * @param file
	 * @param key
	 */
	public String partUpload(File file, String key) {
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		try {
			UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, key);
			// 待上传的本地文件
			uploadFileRequest.setUploadFile(file.getPath());
			// 设置并发下载数，默认1
			uploadFileRequest.setTaskNum(5);
			// 设置分片大小，默认100KB
			uploadFileRequest.setPartSize(1024 * 1024 * 1);
			// 开启断点续传，默认关闭
			uploadFileRequest.setEnableCheckpoint(true);
			UploadFileResult uploadResult = ossClient.uploadFile(uploadFileRequest);
			CompleteMultipartUploadResult multipartUploadResult =
					uploadResult.getMultipartUploadResult();
			_log.info("upload result : " + multipartUploadResult.getETag());
			if (key.startsWith("/")) {
				return bucketNameDomain + key;
			}
			return bucketNameDomain + "/" + key;
		} catch (OSSException oe) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} \n Host ID：{}", oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
		} catch (ClientException ce) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} ", ce.getErrorMessage(), ce.getErrorCode(), ce.getRequestId());
		} catch (Throwable e) {
			_log.error("阿里云上传文件异常：", e);
		} finally {
			ossClient.shutdown();
		}
		return null;
	}

	public String simpleUpload(File file, String key) {
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		try {
			ossClient.putObject(bucketName, key, file);
			if (key.startsWith("/")) {
				return bucketNameDomain + key;
			}
			return bucketNameDomain + "/" + key;
		} catch (OSSException oe) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} \n Host ID：{}", oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
		} catch (ClientException ce) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} ", ce.getErrorMessage(), ce.getErrorCode(), ce.getRequestId());
		} catch (Throwable e) {
			_log.error("阿里云OSS上传文件异常：", e);
		} finally {
			ossClient.shutdown();
		}
		return null;
	}

	/**
	 * 简单上传流到OSS
	 *
	 * @param inputStream
	 * @param key
	 * @return
	 */
	public String simpleUpload(InputStream inputStream, String key) {
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		try {
			ossClient.putObject(bucketName, key, inputStream);
			if (key.startsWith("/")) {
				return bucketNameDomain + key;
			}
			return bucketNameDomain + "/" + key;
		} catch (OSSException oe) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} \n Host ID：{}", oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
		} catch (ClientException ce) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} ", ce.getErrorMessage(), ce.getErrorCode(), ce.getRequestId());
		} catch (Throwable e) {
			_log.error("阿里云OSS上传文件异常：", e);
		} finally {
			ossClient.shutdown();
		}
		return null;
	}

	/**
	 * 根据文件名删除文件
	 * 如果有filePrefix，需要拼接上
	 *
	 * @param fileName
	 */
	public static void deleteFileToAliOss(String fileName) {
		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		try {
			client.deleteObject(bucketName, fileName);
		} catch (OSSException oe) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} \n Host ID：{}", oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
		} catch (ClientException ce) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} ", ce.getErrorMessage(), ce.getErrorCode(), ce.getRequestId());
		} finally {
			client.shutdown();
		}
	}

	/**
	 * 批量删除阿里云图片
	 *
	 * @param keys 图片名称集合
	 */
	public void delBatchPicture(List<String> keys) {
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		try {
			DeleteObjectsResult deleteObjectsResult = ossClient.deleteObjects(new DeleteObjectsRequest(bucketName).withKeys(keys));
			List<String> deletedObjects = deleteObjectsResult.getDeletedObjects();
			for (String object : deletedObjects) {
				System.out.println("阿里云成功删除文件名：\t" + object);
			}
		} catch (OSSException oe) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} \n Host ID：{}", oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
		} catch (ClientException ce) {
			_log.error("阿里云OSS异常：Error Message:{} \n Error Code:{} \n Request ID：{} ", ce.getErrorMessage(), ce.getErrorCode(), ce.getRequestId());
		} finally {
			// 关闭OSS
			ossClient.shutdown();
		}
	}

	public static void main(String[] args) throws IOException {
		//uploadFileToAliOss();//916522AA5EFA76794F45288B3EB2422C-1
		//http://mfile.bjysshop.com/yishenMobile2  访问方式
		//getMyFilesFromAliOss();
		//       deleteFileToAliOss("39a2347f5473431cbd1316c4c5f92026.png");
		// 删除文件。
		List<String> keys = new ArrayList<>();
		keys.add("d0fdb47e1ad24004ae3efd57199c43fb.png");
		keys.add("d0fdb47e1ad24004ae3efd57199c43fb.png");
		//		delBatchPicture(keys);
	}
}
