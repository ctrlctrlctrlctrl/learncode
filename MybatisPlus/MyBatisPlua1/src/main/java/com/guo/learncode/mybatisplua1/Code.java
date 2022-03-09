package com.guo.learncode.mybatisplua1;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * @Auther: Grant
 * @Date: 2022/3/8
 * @Description: com.guo.learncode.mybatisplua1
 * @version: 1.0
 */
public class Code {

    public static void main(String[] args) {

        // 需要构建一个 代码自动生成器 对象
        // 下面的配置都要放到此对象内再通过此对象生产代码
        AutoGenerator mpg = new AutoGenerator();

        // 配置策略
        // 1、全局配置
        GlobalConfig gc = new GlobalConfig();
        // 查看此时总项目的位置
        String projectPath = System.getProperty("user.dir");
        // 通过位置将代码设置在此路径下
        gc.setOutputDir(projectPath+"/src/main/java");
        // 设置作者名字
        gc.setAuthor("guo");
        gc.setOpen(false);
        // 是否覆盖地址中文件夹其他文件或文件夹
        gc.setFileOverride(false);
        // 去Service的I前缀
        gc.setServiceName("%sService");
        // 设置主键类型为手动写入
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        // 将此配置载入代码生成器中
        mpg.setGlobalConfig(gc);

        //2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/go? useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("a123456789");
        // 设置数据库类型
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //3、包的配置
        PackageConfig pc = new PackageConfig();
        // 设置代码放置在哪个模块中
        pc.setModuleName("blog");
        // 设置副项目的名字
        pc.setParent("com.guo.learnautogenerator");
        // 设置实体类包的名字
        pc.setEntity("entity");
        // 设置映射mapper包的名字
        pc.setMapper("mapper");
        // 设置service服务包的名字
        pc.setService("service");
        // 设置controller包的名字
        pc.setController("controller");
        // 将此配置载入代码生成器中
        mpg.setPackageInfo(pc);


        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 设置数据库中要映射的表名
        strategy.setInclude("account");
        // 设置生成的名字为驼峰命名法
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 设置实体类自动lombok；
        strategy.setEntityLombokModel(true);
        // 设置逻辑删除字段名才能进行逻辑删除
//        strategy.setLogicDeleteFieldName("deleted");
        // 自动填充配置
        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        // 乐观锁
//        strategy.setVersionFieldName("version");
//        strategy.setRestControllerStyle(true);
//        strategy.setControllerMappingHyphenStyle(true); //localhost:8080/hello_id_2
        // 将此配置载入代码生成器中
        mpg.setStrategy(strategy);

        // 执行代码生成器生成代码
        mpg.execute();
    }
}
