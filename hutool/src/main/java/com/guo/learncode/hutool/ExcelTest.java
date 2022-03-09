package com.guo.learncode.hutool;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.util.*;

/**
 * @Auther: Grant
 * @Date: 2022/3/9
 * @Description: com.guo.learncode.hutool
 * @version: 1.0
 */
public class ExcelTest {

    public static void main(String[] args) {
//        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("test.xlsx"), 0);
//        List<Order> orders = reader.readAll(Order.class);
//        System.out.println(orders);
//        ArrayList<String> r1 = CollUtil.newArrayList("a", "b", "c");
//        ArrayList<String> r2 = CollUtil.newArrayList("a2", "b2", "c2");
//        ArrayList<String> r3 = CollUtil.newArrayList("a3", "b3", "c3");
//        ArrayList<String> r4 = CollUtil.newArrayList("a4", "b5", "c5");
//        ArrayList<String> r5 = CollUtil.newArrayList("a5", "b6", "c6");
//        ArrayList<ArrayList<String>> rows = CollUtil.newArrayList(r1, r2, r3, r4, r5);
//        ExcelWriter writer = ExcelUtil.getWriter("test1.xlsx");
//        writer.passCurrentRow();
//        writer.merge(r1.size()-1,"标题");
//        writer.write(rows,true);
//        writer.close();

//        LinkedHashMap<String, Object> row1 = new LinkedHashMap<>();
//        row1.put("姓名","张三");
//        row1.put("年龄",2);
//        row1.put("成绩",88.32);
//        row1.put("是否合格",true);
//        row1.put("考试日期",new Date());
//
//        System.out.println(row1.size());

//        LinkedHashMap<String, Object> row2 = new LinkedHashMap<>();
//        row2.put("姓名","李四");
//        row2.put("年龄",3);
//        row2.put("成绩",59);
//        row2.put("是否合格",false);
//        row2.put("考试日期",new Date());
//
//        ArrayList<LinkedHashMap<String, Object>> linkedHashMaps = CollUtil.newArrayList(row1, row2);
//
        ExcelWriter writer = ExcelUtil.getWriter("test2.xlsx");
        writer.addHeaderAlias("","");
//        writer.merge(row1.size()-1,"成绩单");
//        writer.write(linkedHashMaps,true);
//        writer.close();

    }
}
