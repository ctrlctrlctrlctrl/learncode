package com.guo.learn.mapstruct.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Auther: Grant
 * @Date: 2022/3/3
 * @Description: com.guo.learn.mapstruct.covert
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVO1 {
    private Integer id;
    private String name;
    private String createTime;
    private LocalDateTime updateTime;
}
