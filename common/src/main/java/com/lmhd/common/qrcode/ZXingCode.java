package com.lmhd.common.qrcode;

import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Description: (二维码)
 * @author tom
 */
public class ZXingCode {
	
	private static final int BLACK = 0xFF000000;//黑色
	private static final int WHITE = 0xFFFFFFFF;//白色
	private static final int QRCODE_DEFAULT_SIZE = 300;

	public static final ErrorCorrectionLevel CORRECTION_7 =  ErrorCorrectionLevel.L;
	public static final ErrorCorrectionLevel CORRECTION_15 =  ErrorCorrectionLevel.M;
	public static final ErrorCorrectionLevel CORRECTION_25 =  ErrorCorrectionLevel.Q;
	public static final ErrorCorrectionLevel CORRECTION_30 =  ErrorCorrectionLevel.H;
	private static class SingletonHolder{
        private final static ZXingCode INSTANCE =new ZXingCode();
    }   
	
    private ZXingCode(){}
    
    public static ZXingCode getInstance(){
        return SingletonHolder.INSTANCE;
    }

	/**
	 * 给二维码图片添加Logo
	 *
	 * @param qrPic
	 * @param logoPic
	 */
	public void addLogoQRCode(File qrPic, File logoPic, ZxingLogoConfig logoConfig,File outputFile) {
		try {
			if (!qrPic.isFile() || !logoPic.isFile()) {
				System.out.print("file not find !");
				System.exit(0);
			}

			/**
			 * 读取二维码图片，并构建绘图对象
			 */
			BufferedImage image = ImageIO.read(qrPic);
			Graphics2D g = image.createGraphics();

			/**
			 * 读取Logo图片
			 */
			BufferedImage logo = ImageIO.read(logoPic);
			/**
			 * 设置logo的大小,本人设置为二维码图片的20%,因为过大会盖掉二维码
			 */
			int widthLogo = logo.getWidth(null) > image.getWidth() * 2 / 10 ? (image.getWidth() * 2 / 10)
					: logo.getWidth(null),
					heightLogo = logo.getHeight(null) > image.getHeight() * 2 / 10 ? (image.getHeight() * 2 / 10)
							: logo.getWidth(null);

			// 计算图片放置位置
			/**
			 * logo放在中心
			 */
			int x = (image.getWidth() - widthLogo) / 2;
			int y = (image.getHeight() - heightLogo) / 2;
			/**
			 * logo放在右下角
			 */
			/*
			 * int x = (image.getWidth() - widthLogo); int y =
			 * (image.getHeight() - heightLogo);
			 */
			// 开始绘制图片
			g.drawImage(logo, x, y, widthLogo, heightLogo, null);
			g.drawRoundRect(x, y, widthLogo, heightLogo, 15, 15);
			g.setStroke(new BasicStroke(logoConfig.getBorder()));
			g.setColor(logoConfig.getBorderColor());
			g.drawRect(x, y, widthLogo, heightLogo);

			g.dispose();
			logo.flush();
			image.flush();

			ImageIO.write(image, "png", outputFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addLogoWordQRCode(File qrPic, String logoWord, Integer fontSize, File outPutFile) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(qrPic);
			if (image==null || StringUtils.isBlank(logoWord)) {
				System.out.print("file not find !");
				return;
			}
			Graphics2D g = image.createGraphics();
			int widthLogo = g.getFontMetrics().stringWidth(logoWord);
			int heightLogo= 10; 
			int x = (image.getWidth() - widthLogo) / 2;
			int y = (image.getHeight() - heightLogo) / 2;
			// 开始绘制图片
			Font font=new Font("黑体", Font.PLAIN, fontSize);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString(logoWord, x, y);
			g.dispose();
			image.flush();
			ImageIO.write(image,"png",outPutFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 二维码的解析
	 *
	 * @param file
	 */
	public String parseQrCodeImage(File file) {
		try {
			BufferedImage image = ImageIO.read(file);
			return parseQrCodeImage(image);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 通过URL解析二维码
	 * @param url
	 * @return
	 */
	public String parseQrCodeImage(URL url) {
		try {
			BufferedImage image = ImageIO.read(url);
			return parseQrCodeImage(image);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 通过输入流解析二维码
	 * @param inputStream
	 * @return
	 */
	public String parseQrCodeImage(InputStream inputStream) {
		try {
			BufferedImage image = ImageIO.read(inputStream);
			return parseQrCodeImage(image);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private String parseQrCodeImage(BufferedImage image){

		try{
			MultiFormatReader formatReader = new MultiFormatReader();
			LuminanceSource source = new BufferedImageLuminanceSource(image);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);

			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			Result result = formatReader.decode(binaryBitmap, hints);
			return result.toString();
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static File generateCode(String content,String filePath){
		return generateCode(content,filePath,QRCODE_DEFAULT_SIZE,ZXingCode.CORRECTION_30);
	}

	public static File generateCode(String content,String filePath,int size,ErrorCorrectionLevel quality){

		File file = new File(filePath);
		Hashtable hints = new Hashtable();
		hints.put(EncodeHintType.ERROR_CORRECTION, quality);
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hints.put(EncodeHintType.MARGIN, 1);
		try {
			// 参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数
			BitMatrix bm = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, size, size, hints);
			int w = bm.getWidth(), h = bm.getHeight();
			BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					image.setRGB(x, y, bm.get(x, y) ? 0xFF000000 : 0xFFCCDDEE);
				}
			}
			ImageIO.write(image, "png", file);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return file;

	}

}