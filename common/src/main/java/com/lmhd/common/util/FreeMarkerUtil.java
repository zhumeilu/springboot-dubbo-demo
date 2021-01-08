package com.lmhd.common.util;

import freemarker.cache.ByteArrayTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.FileWriterWithEncoding;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @Auther: zhumeilu
 * @Date: 2019/7/3 16:29
 * @Description:
 */
public class FreeMarkerUtil {

    public static void generate(String inFilePath, String outFilePath, Map data) throws IOException, TemplateException {
        InputStream resourceAsStream = FreeMarkerUtil.class.getResourceAsStream(inFilePath);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(resourceAsStream, byteArrayOutputStream);
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_27);
        ByteArrayTemplateLoader loader = new ByteArrayTemplateLoader();
        loader.putTemplate("myTemplate", byteArrayOutputStream.toByteArray());
        cfg.setTemplateLoader(loader);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);
        Template temp = cfg.getTemplate("myTemplate");
        File outputFile = new File(outFilePath);
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();
        }
        FileWriterWithEncoding writer = new FileWriterWithEncoding(outFilePath, "utf-8");
        temp.process(data, writer);
    }
}
