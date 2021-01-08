<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN" "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd" >
<generatorConfiguration>

    <!-- 配置文件 -->
    <#--<properties resource="generator.properties"></properties>-->

    <context id="MysqlContext" targetRuntime="MyBatis3" defaultModelType="flat">

        <property name="javaFileEncoding" value="UTF-8"/>
        <!-- 由于beginningDelimiter和endingDelimiter的默认值为双引号(")，在Mysql中不能这么写，所以还要将这两个默认值改为`  -->
        <property name="beginningDelimiter" value="`"/>
        <property name="endingDelimiter" value="`"/>

        <!-- 为生成的Java模型创建一个toString方法 -->
        <plugin type="org.mybatis.generator.plugins.ToStringPlugin"></plugin>

        <!-- 为生成的Java模型类添加序列化接口，并生成serialVersionUID字段 -->
        <plugin type="com.lmhd.common.codegenerator.SerializablePlugin">
            <property name="suppressJavaInterface" value="false"/>
        </plugin>


        <!-- 生成一个新的selectByExample方法，这个方法可以接收offset和limit参数，主要用来实现分页，只支持mysql(已使用pagehelper代替) -->
        <!--<plugin type="com.lmhd.common.plugin.PaginationPlugin"></plugin>-->

        <!-- 生成在XML中的<cache>元素 -->
        <#--<plugin type="org.mybatis.generator.plugins.CachePlugin">-->
            <#--<!-- 使用ehcache &ndash;&gt;-->
            <#--<property name="cache_type" value="com.lmhd.common.cache.db.LoggingRedisCache"/>-->
            <#--<!-- 内置cache配置 &ndash;&gt;-->
            <#--<!---->
            <#--<property name="cache_eviction" value="LRU" />-->
            <#--<property name="cache_flushInterval" value="60000" />-->
            <#--<property name="cache_readOnly" value="true" />-->
            <#--<property name="cache_size" value="1024" />-->
            <#--&ndash;&gt;-->
        <#--</plugin>-->

        <!-- Java模型生成equals和hashcode方法 -->
        <plugin type="org.mybatis.generator.plugins.EqualsHashCodePlugin"></plugin>

        <!-- 生成的代码去掉注释 -->
        <commentGenerator type="com.lmhd.common.codegenerator.CommentGenerator">
            <property name="suppressAllComments" value="true"/>
            <property name="suppressDate" value="true"/>
        </commentGenerator>

        <!-- 数据库连接 -->
        <jdbcConnection driverClass="${generator_jdbc_driver!}"
                        connectionURL="${generator_jdbc_url!}"
                        userId="${generator_jdbc_username!}"
                        password="${generator_jdbc_password!}"/>

        <javaTypeResolver>
            <#--            <property name="forceBigDecimals" value="true"/>-->
            <!-- This property is used to specify whether MyBatis Generator should force the use of JSR-310 data types for DATE, TIME,
            and TIMESTAMP fields, rather than using java.util.Date -->
            <property name="useJSR310Types" value="${use_JSR310_types?string('true','false')}"/>
<#--            <property name="useJSR310Types" value="true"/>-->
        </javaTypeResolver>

        <!-- model生成 -->
        <javaModelGenerator targetPackage="${generator_javaModelGenerator_targetPackage}" targetProject="${targetProject}/src/main/java"/>

        <!-- MapperXML生成 -->
        <sqlMapGenerator targetPackage="${generator_sqlMapGenerator_targetPackage}" targetProject="${targetProject_sqlMap}/src/main/resources"/>

        <!-- Mapper接口生成 -->
        <javaClientGenerator targetPackage="${generator_javaClientGenerator_targetPackage}" targetProject="${targetProject}/src/main/java" type="XMLMAPPER"/>


        
        <!-- 需要映射的表 -->
        <#list tables as table>
            <#assign keys = last_insert_id_tables?keys>
            <#if keys?seq_contains(table.table_name)>
                <table tableName="${table.table_name}" domainObjectName="${table.model_name}">
                    <generatedKey column="${last_insert_id_tables[table.table_name]}" sqlStatement="MySql" identity="true"/>
                </table>
            <#else>
                <table tableName="${table.table_name}" domainObjectName="${table.model_name}"></table>

            </#if>

        </#list>
        <#--#foreach($table in $tables)-->
            <#--#if($last_insert_id_tables.containsKey($!table.table_name) == true)-->
                <#--<table tableName="$!table.table_name" domainObjectName="$!table.model_name">-->
                    <#--<generatedKey column="$!last_insert_id_tables.get($!table.table_name)" sqlStatement="MySql" identity="true"/>-->
                <#--</table>-->
            <#--#else-->
                <#--<table tableName="$!table.table_name" domainObjectName="$!table.model_name"></table>-->
            <#--#end-->
        <#--#end-->
    </context>
</generatorConfiguration>
