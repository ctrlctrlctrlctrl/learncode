package com.guo.learncode.mybatisplua1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: Grant
 * @Date: 2022/3/9
 * @Description: com.guo.learncode.mybatisplua1.entity
 * @version: 1.0
 */
@Data
public class Account2 implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String perms;

    private String role;
}
