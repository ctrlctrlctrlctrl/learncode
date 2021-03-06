package com.guo.learn.mapstruct.covert;

import com.guo.learn.mapstruct.entiry.User;
import com.guo.learn.mapstruct.vo.UserVO1;
import com.guo.learn.mapstruct.vo.UserVO2;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Auther: Grant
 * @Date: 2022/3/3
 * @Description: com.guo.learn.mapstruct.covert
 * @version: 1.0
 */
@Mapper(componentModel = "spring")
public interface UserCovertBasic {
    UserCovertBasic INSTANCE = Mappers.getMapper(UserCovertBasic.class);

    /**
     * 字段数量类型数量相同，利用工具BeanUtils也可以实现类似效果
     * @param source
     * @return
     */
    UserVO1 toConvertVO1(User source);
    User fromConvertEntity1(UserVO1 userVO1);

    /**
     * 字段数量类型相同,数量少：仅能让多的转换成少的，故没有fromConvertEntity2
     * @param source
     * @return
     */
    UserVO2 toConvertVO2(User source);
}
