package com.guo.learncode.mybatisplua1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guo.learncode.mybatisplua1.entity.Account;
import com.guo.learncode.mybatisplua1.entity.Account2;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guo
 * @since 2022-03-08
 */
@Repository
public interface AccountMapper extends BaseMapper<Account> {

    @Select("SELECT * FROM account")
    List<Account2> getAccountList();
}
