package com.lmhd.common.codegenerator;

/**
 * 代码生成类
 * Created by LMHD.TECGROUP on 2017/1/10.
 */
public class CodeGenerator {

    protected void generate(CodeGeneratorConfig config) throws Exception {
        MybatisGeneratorUtil.generator(config.isExact(), config.getJdbcDriver(), config.getJdbcUrl(), config.getJdbcName(),
                config.getJdbcPassword(), config.getParentModule(), config.getModule(), config.getDatabase(), config.getTablePrefix(),
                config.getPackageName(), config.getReturnIdTables(), config.getGeneratorClassLocationModule(),config.getUseJSR310Types());
    }


    public static void main(String[] args) {
        try {

            CodeGeneratorConfig codeGeneratorConfig = new CodeGeneratorConfig(
                    "",
                    "producer",
                    "loan-order",
                    "",
                    "com.zml.demo.producer",
                    "common",
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://192.168.1.237:3306/loan-order",
                    "root",
                    "Sowhat?",true);
            new CodeGenerator().generate(codeGeneratorConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
