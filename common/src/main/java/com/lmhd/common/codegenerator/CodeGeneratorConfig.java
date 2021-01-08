package com.lmhd.common.codegenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhumeilu
 * @Date: 2019/7/26 15:19
 * @Description:
 */
public class CodeGeneratorConfig {

    // 根据命名规范，只修改此常量值即可
    private String parentModule;
    //生成代码的模块名
    private String module;
    //库名
    private String database;
    //表前缀
    private String tablePrefix;
    //包结构
    private String packageName;
    //生成类所在的模块的名称
    private String generatorClassLocationModule;
    private String jdbcDriver;
    private String jdbcUrl;
    private String jdbcName;
    private String jdbcPassword;
    //用于TABLE_PREFIX	表名称是否精确匹配
    private boolean isExact = false;
    // 需要insert后返回主键的表配置，key:表名,value:主键名
    private Map<String, String> returnIdTables = new HashMap<>();

    //用于将Date转换成LocalDateTime
    private boolean useJSR310Types = false;

    public CodeGeneratorConfig(String parentModule, String module, String database, String tablePrefix, String packageName, String generatorClassLocationModule, String jdbcDriver, String jdbcUrl, String jdbcName, String jdbcPassword) {
        this.parentModule = parentModule;
        this.module = module;
        this.database = database;
        this.tablePrefix = tablePrefix;
        this.packageName = packageName;
        this.generatorClassLocationModule = generatorClassLocationModule;
        this.jdbcDriver = jdbcDriver;
        this.jdbcUrl = jdbcUrl;
        this.jdbcName = jdbcName;
        this.jdbcPassword = jdbcPassword;
    }

    public CodeGeneratorConfig(String parentModule, String module, String database, String tablePrefix, String packageName, String generatorClassLocationModule, String jdbcDriver, String jdbcUrl, String jdbcName, String jdbcPassword,boolean useJSR310Types) {
        this.parentModule = parentModule;
        this.module = module;
        this.database = database;
        this.tablePrefix = tablePrefix;
        this.packageName = packageName;
        this.generatorClassLocationModule = generatorClassLocationModule;
        this.jdbcDriver = jdbcDriver;
        this.jdbcUrl = jdbcUrl;
        this.jdbcName = jdbcName;
        this.jdbcPassword = jdbcPassword;
        this.useJSR310Types = useJSR310Types;
    }

    public CodeGeneratorConfig(String parentModule, String module, String database, String tablePrefix, String packageName, String generatorClassLocationModule, String jdbcDriver, String jdbcUrl, String jdbcName, String jdbcPassword, boolean isExact,boolean useJSR310Types) {
        this.parentModule = parentModule;
        this.module = module;
        this.database = database;
        this.tablePrefix = tablePrefix;
        this.packageName = packageName;
        this.generatorClassLocationModule = generatorClassLocationModule;
        this.jdbcDriver = jdbcDriver;
        this.jdbcUrl = jdbcUrl;
        this.jdbcName = jdbcName;
        this.jdbcPassword = jdbcPassword;
        this.isExact = isExact;
        this.useJSR310Types = useJSR310Types;
    }

    public CodeGeneratorConfig(String parentModule, String module, String database, String tablePrefix, String packageName, String generatorClassLocationModule, String jdbcDriver, String jdbcUrl, String jdbcName, String jdbcPassword, boolean isExact, Map<String, String> returnIdTables,boolean useJSR310Types) {
        this.parentModule = parentModule;
        this.module = module;
        this.database = database;
        this.tablePrefix = tablePrefix;
        this.packageName = packageName;
        this.generatorClassLocationModule = generatorClassLocationModule;
        this.jdbcDriver = jdbcDriver;
        this.jdbcUrl = jdbcUrl;
        this.jdbcName = jdbcName;
        this.jdbcPassword = jdbcPassword;
        this.isExact = isExact;
        this.returnIdTables = returnIdTables;
        this.useJSR310Types = useJSR310Types;
    }

    public String getParentModule() {
        return parentModule;
    }

    public void setParentModule(String parentModule) {
        this.parentModule = parentModule;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getGeneratorClassLocationModule() {
        return generatorClassLocationModule;
    }

    public void setGeneratorClassLocationModule(String generatorClassLocationModule) {
        this.generatorClassLocationModule = generatorClassLocationModule;
    }

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcName() {
        return jdbcName;
    }

    public void setJdbcName(String jdbcName) {
        this.jdbcName = jdbcName;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public boolean isExact() {
        return isExact;
    }

    public void setExact(boolean exact) {
        isExact = exact;
    }

    public Map<String, String> getReturnIdTables() {
        return returnIdTables;
    }

    public void setReturnIdTables(Map<String, String> returnIdTables) {
        this.returnIdTables = returnIdTables;
    }

    public Boolean getUseJSR310Types() {
        return useJSR310Types;
    }

    public void setUseJSR310Types(Boolean useJSR310Types) {
        this.useJSR310Types = useJSR310Types;
    }
}
