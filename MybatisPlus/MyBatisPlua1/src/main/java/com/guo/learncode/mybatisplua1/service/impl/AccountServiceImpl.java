package com.guo.learncode.mybatisplua1.service.impl;


import com.guo.learncode.mybatisplua1.entity.Account;
import com.guo.learncode.mybatisplua1.mapper.AccountMapper;
import com.guo.learncode.mybatisplua1.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guo
 * @since 2022-03-08
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
