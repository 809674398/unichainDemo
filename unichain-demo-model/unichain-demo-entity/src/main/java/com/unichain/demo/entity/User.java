package com.unichain.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.unichain.demo.entity.support.BaseEntity;
import lombok.Data;

/**
 * @program: User
 * @description: 用户信息类
 * @author: Chonzi.xiao
 * @create: 2019-04-01 14:14
 **/
@Data
@TableName("user")
public class User extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("email")
    private String email;

    @TableField("app_name")
    private String appName;
}
