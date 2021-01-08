package com.lmhd.common.codegenerator;

import com.lmhd.common.util.FreeMarkerUtil;
import com.lmhd.common.util.StringUtil;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.lmhd.common.util.StringUtil.lineToHump;

/**
 * 代码生成类
 * Created by LMHD.TECGROUP on 2017/1/10.
 */
public class MybatisGeneratorUtil {

    // generatorConfig模板路径
    private static String generatorConfig_vm = "/template/generatorConfig.ftl";
    // Service模板路径
    private static String service_vm = "/template/Service.ftl";
    // ServiceMock模板路径
    private static String serviceMock_vm = "/template/ServiceMock.ftl";
    // ServiceImpl模板路径
    private static String serviceImpl_vm = "/template/ServiceImpl.ftl";

    /**
     * 根据模板生成generatorConfig.xml文件
     *
     * @param jdbc_driver   驱动路径
     * @param jdbc_url      链接
     * @param jdbc_username 帐号
     * @param jdbc_password 密码
     * @param module        项目模块
     * @param database      数据库
     * @param table_prefix  表前缀
     * @param package_name  包名
     */
    public static void generator(
            boolean exact,
            String jdbc_driver,
            String jdbc_url,
            String jdbc_username,
            String jdbc_password,
            String parent_module,
            String module,
            String database,
            String table_prefix,
            String package_name,
            Map<String, String> last_insert_id_tables, String generator_class_location_model,boolean use_JSR310_types) throws Exception {

        String targetProject = StringUtils.isEmpty(parent_module) ?
                module + "/" + module + "-dao" :
                parent_module + "/" + module + "/" + module + "-dao";
        String basePath = MybatisGeneratorUtil.class.getResource("/").getPath().replace("/target/classes/", "").replace(targetProject, "").replace(generator_class_location_model, "");
        String generatorConfig_xml = MybatisGeneratorUtil.class.getResource("/").getPath().replace("/target/classes/", "") + "/src/main/resources/generatorConfig.xml";
        targetProject = basePath + targetProject;
        String sql = null;
        if (StringUtils.isEmpty(table_prefix)) {
            sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "'";
        } else {
            if (exact) {
                sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "' AND table_name = '" + table_prefix + "';";
            } else {
                sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "' AND table_name LIKE '" + table_prefix + "%';";
            }
        }
        System.out.println("========== 开始生成generatorConfig.xml文件 ==========");
        List<Map<String, Object>> tables = new ArrayList<>();
        List<String> deletNewCreateTable_Model = new ArrayList<>();
        List<String> deletNewCreateTable_MapperXml = new ArrayList<>();
        List<String> deletNewCreateTable_MapperJava = new ArrayList<>();
        try {
            Map data = new HashMap();
            Map<String, Object> table;
            // 查询定制前缀项目的所有表
            //			JdbcUtil jdbcUtil = new JdbcUtil(jdbc_driver, jdbc_url, jdbc_username, CoreCodecUtils.AESDecode(jdbc_password, CoreCodecUtils.AES_DEFAULT_SEED));
            JdbcUtil jdbcUtil = new JdbcUtil(jdbc_driver, jdbc_url, jdbc_username, jdbc_password);
            List<Map> result = jdbcUtil.selectByParams(sql, null);
            for (Map map : result) {
                System.out.print(map.get("TABLE_NAME") + "---->");
                table = new HashMap<>();
                table.put("table_name", map.get("TABLE_NAME"));
                String mName = lineToHump(ObjectUtils.toString(map.get("TABLE_NAME")));
                deletNewCreateTable_Model.add(mName);
                String expName = mName + "Example";
                deletNewCreateTable_Model.add(expName);
                String mapperXMLName = mName + "Mapper";
                deletNewCreateTable_MapperXml.add(mapperXMLName);
                deletNewCreateTable_MapperJava.add(mapperXMLName);
                table.put("model_name", mName);
                System.out.println(lineToHump(ObjectUtils.toString("#" + map.get("TABLE_NAME"))));
                tables.add(table);
            }
            jdbcUtil.release();
            String targetProject_sqlMap = StringUtils.isEmpty(parent_module) ?
                    basePath + module + "/" + module + "-dao" :
                    basePath + "/" + parent_module + "/" + module + "/" + module + "-dao";
            data.put("tables", tables);
            data.put("generator_javaModelGenerator_targetPackage", package_name + ".dao.model");
            data.put("generator_sqlMapGenerator_targetPackage", "sqlmapper");
            //			context.put("generator_sqlMapGenerator_targetPackage", package_name + ".dao.mapper");
            data.put("generator_javaClientGenerator_targetPackage", package_name + ".dao.mapper");
            data.put("targetProject", targetProject);
            data.put("targetProject_sqlMap", targetProject_sqlMap);
            data.put("generator_jdbc_driver", jdbc_driver);
            data.put("generator_jdbc_url", jdbc_url);
            data.put("generator_jdbc_username", jdbc_username);
            data.put("generator_jdbc_password", jdbc_password);
            data.put("last_insert_id_tables", last_insert_id_tables);
            data.put("use_JSR310_types", use_JSR310_types);

            //创建dao项目代码生成目录
            File targetProjectDir = new File(targetProject+"/src/main/java");
            File targetProjectMapperDir = new File(targetProject_sqlMap+"/src/main/resources");
            if(!targetProjectDir.exists()){
                targetProjectDir.mkdirs();
            }
            if(!targetProjectMapperDir.exists()){
                targetProjectMapperDir.mkdirs();
            }

            FreeMarkerUtil.generate(generatorConfig_vm, generatorConfig_xml, data);

            // 删除旧代码
            deleteDir(deletNewCreateTable_Model, new File(targetProject + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/dao/model"));
            //不删除已经生成的Mapper文件
            deleteDir(deletNewCreateTable_MapperJava, new File(targetProject + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/dao/mapper"));
            //不删除已经生成的SqlMap文件
            deleteDir(deletNewCreateTable_MapperXml, new File(targetProject_sqlMap + "/src/main/resources/sqlmapper"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("========== 结束生成generatorConfig.xml文件 ==========");
        System.out.println("========== 开始运行MybatisGenerator ==========");
        List<String> warnings = new ArrayList<>();
        File configFile = new File(generatorConfig_xml);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
        System.out.println("========== 结束运行MybatisGenerator ==========");
        System.out.println("========== 开始生成Service ==========");
        String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
        String servicePath = StringUtils.isEmpty(parent_module)
                ? basePath + module + "/" + module + "-api" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/api/base"
                : basePath + parent_module + "/" + module + "/" + module + "-api" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/api/base";
        String serviceImplPath = StringUtils.isEmpty(parent_module) ?
                basePath + module + "/" + module + "-service" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/service/impl/base"
                : basePath + parent_module + "/" + module + "/" + module + "-service" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/service/impl/base";
        for (int i = 0; i < tables.size(); i++) {
            String model = lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));
            String service = servicePath + "/" + model + "Service.java";
            String serviceMock = servicePath + "/" + model + "ServiceMock.java";
            String serviceImpl = serviceImplPath + "/" + model + "ServiceImpl.java";
            // 生成service
            File serviceFile = new File(service);
            if (!serviceFile.exists()) {
                Map data = new HashMap();

                data.put("package_name", package_name);
                data.put("model", model);
                data.put("ctime", ctime);
                FreeMarkerUtil.generate(service_vm, service, data);
                System.out.println(service);
            }
            // 生成serviceMock
            File serviceMockFile = new File(serviceMock);
            if (!serviceMockFile.exists()) {
                Map data = new HashMap();
                data.put("package_name", package_name);
                data.put("model", model);
                data.put("ctime", ctime);
                FreeMarkerUtil.generate(serviceMock_vm, serviceMock, data);
                System.out.println(serviceMock);
            }
            // 生成serviceImpl
            File serviceImplFile = new File(serviceImpl);
            if (!serviceImplFile.exists()) {
                Map data = new HashMap();
                data.put("package_name", package_name);
                data.put("model", model);
                data.put("mapper", StringUtil.toLowerCaseFirstOne(model));
                data.put("ctime", ctime);
                FreeMarkerUtil.generate(serviceImpl_vm, serviceImpl, data);
                System.out.println(serviceImpl);
            }
        }
        System.out.println("========== 结束生成Service ==========");
        System.out.println("========== 开始生成Controller ==========");
        System.out.println("========== 结束生成Controller ==========");
    }

    // 递归删除非空文件夹
    public static void deleteDir(List<String> deleteFile, File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteDir(deleteFile, files[i]);
            }
        }
        String name = file.getName();
        if (name.endsWith(".java")) {
            name = name.substring(0, name.length() - 5);
        } else if (name.endsWith(".xml")) {
            name = name.substring(0, name.length() - 4);
        }
        if (deleteFile.contains(name)) {
            file.delete();
        }
    }
}
