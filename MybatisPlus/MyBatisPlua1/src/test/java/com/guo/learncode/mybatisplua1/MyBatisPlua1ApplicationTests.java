package com.guo.learncode.mybatisplua1;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.guo.learncode.mybatisplua1.entity.Account;
import com.guo.learncode.mybatisplua1.entity.Account2;
import com.guo.learncode.mybatisplua1.mapper.AccountMapper;
import com.guo.learncode.mybatisplua1.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@SpringBootTest
class MyBatisPlua1ApplicationTests {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        Account account = accountService.getById(1);
        System.out.println(account);
        account.setUsername("bbs");

        account=accountService.getById(1);
        System.out.println(account);

    }

    @Test
    void contextLoads2() {
        Account account = accountService.getById(1);
        account.setUsername("bbs");
        accountService.updateById(account);
    }

    @Test
    void contextLoads3(){
        List<Account2> accounts1 = accountMapper.getAccountList();
        ArrayList<Account2> accounts = new ArrayList<>();
        for (Account2 account:accounts1){
            accounts.add(account);
        }
        Date date = new Date();
        DateFormat df2 = DateFormat.getDateTimeInstance();
        String dateTime = df2.format(date);


        ExcelWriter writer = ExcelUtil.getWriter("C:\\Users\\Grant\\Desktop\\帐号文件"+dateTime+".xlsx");
        writer.addHeaderAlias("id","id");
        writer.addHeaderAlias("username","用户名");
        writer.addHeaderAlias("password","密码");
        writer.addHeaderAlias("perms","帐号");
        writer.addHeaderAlias("role","角色");

        writer.merge(5,"帐号详情");
        writer.write(accounts,true);
        writer.close();

    }

    @Test
    public void contextloads4(){
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();//日期格式，精确到日
        System.out.println(df1.format(date));
        DateFormat df2 = DateFormat.getDateTimeInstance();//可以精确到时分秒
        System.out.println(df2.format(date));
        DateFormat df3 = DateFormat.getTimeInstance();//只显示出时分秒
        System.out.println(df3.format(date));
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL); //显示日期，周，上下午，时间（精确到秒）
        System.out.println(df4.format(date));
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG); //显示日期,上下午，时间（精确到秒）
        System.out.println(df5.format(date));
        DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT); //显示日期，上下午,时间（精确到分）
        System.out.println(df6.format(date));
        DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM); //显示日期，时间（精确到分）
        System.out.println(df7.format(date));
    }

}
