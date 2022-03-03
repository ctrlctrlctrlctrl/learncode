package com.guo.learn.mapstruct.entiry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Auther: Grant
 * @Date: 2022/3/3
 * @Description: com.guo.learn.mapstruct.entiry
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer id;
    private String name;
    private String createTime;
    private LocalDateTime updateTime;
}