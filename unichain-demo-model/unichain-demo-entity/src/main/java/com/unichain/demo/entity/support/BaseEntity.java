package com.unichain.demo.entity.support;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * @program: BaseEntity
 * @description: BaseEntity
 * @author: Chonzi.xiao
 * @create: 2019-04-01 14:10
 **/
public class BaseEntity {

    /**
     * 默认表主键
     */
    @TableId(type= IdType.AUTO)
    private Long id;

    /**
     * 逻辑删除 0 可用 1 不可用
     */
    @TableField("disable")
    private Integer disable;

    /**
     * 创建时间
     */
    @TableField("ctime")
    private Date ctime;

    /**
     * 修改时间
     */
    @TableField("utime")
    private Date utime;
}
