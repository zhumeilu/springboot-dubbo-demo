package com.lmhd.common.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Hashtable;

/**
 * @Auther: zhumeilu
 * @Date: 2019/5/31 10:32
 * @Description:
 */
public class QrCodeUtils {

    // 二维码尺寸
    public static final int QRCODE_SIZE = 300;

    /**
     * 生成二维码
     * @param content   源内容
     * @param outputStream 输出流
     * @throws Exception
     */
    public static void createImage(String content, OutputStream outputStream) throws Exception {
        Hashtable hints = new Hashtable();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.MARGIN, 1);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE,
                hints);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
            }
        }
        // 存到磁盘
        ImageIO.write(image, "jpg", outputStream);
    }

    public static void createImage(String qrCodeUrl,String outPutFilePath) throws Exception {
        OutputStream outputStream = new ByteArrayOutputStream();
        createImage(qrCodeUrl,outputStream);
        FileOutputStream fos = new FileOutputStream(new File(outPutFilePath));
        fos.write(((ByteArrayOutputStream) outputStream).toByteArray());
        fos.flush();
        fos.close();
    }
}
