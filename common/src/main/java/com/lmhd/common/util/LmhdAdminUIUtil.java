package com.lmhd.common.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压lmhdAdmin-x.x.x.jar到resources目录
 * Created by Charles on 2016/12/18.
 */
public class LmhdAdminUIUtil implements InitializingBean, ServletContextAware {

	protected static final Logger _log = LoggerFactory.getLogger(LmhdAdminUIUtil.class);

	@Override
	public void afterPropertiesSet() throws Exception {
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		_log.info("===== 开始解压lmhd-admin =====");
		String name = PropertiesFileUtil.getInstance().get("lmhd.admin.ui.name");
		String version = PropertiesFileUtil.getInstance().get("lmhd.admin.ui.version");
		_log.info("lmhd-admin.jar 版本: {}", version);
		String jarPath = servletContext.getRealPath("/WEB-INF/lib/" + name + "-" + version + ".jar");
		_log.info("lmhd-admin.jar 包路径: {}", jarPath);
		String unpackname = PropertiesFileUtil.getInstance().get("lmhd.admin.ui.unpackname");
		String resourcess = servletContext.getRealPath("/") + "/resources/" + unpackname;
		_log.info("lmhd-admin.jar 解压到: {}", resourcess);
		JarUtil.decompress(jarPath, resourcess);
		_log.info("===== 解压lmhd-admin完成 =====");
		//		//获取容器资源解析器
		//		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		//		try {
		//			//获取所有匹配的文件
		//			Resource[] resources = resolver.getResources("/uistatic/**");
		//			for (Resource resource : resources) {
		//				//获得文件流，因为在jar文件中，不能直接通过文件资源路径拿到文件，但是可以在jar包中拿到文件流
		//				InputStream stream = resource.getInputStream();
		//				String targetPath = "D:/lmhd-boot-framework/lmhd-boot-upms/lmhd-boot-upms-admin/target/classes/uistatic/";
		//				String targetFilePath = targetPath + resource.getFilename();
		//				_log.info("lmhd-admin.jar 解压到: {}", targetPath);
		//				File ttfFile = new File(targetFilePath);
		//				FileUtils.copyInputStreamToFile(stream, ttfFile);
		//			}
		//		} catch (IOException e) {
		//		}
	}
}
