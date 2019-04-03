package com.unichain.demo.pojo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @program: BaseInfo
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-03 15:53
 **/
public class BaseInfo implements Serializable{
    @ApiModelProperty(value = "账号id")
    private Long accountId;
    @ApiModelProperty(value = "手机号")
    private String accountName;
    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "系统名称")
    private String os;
    @ApiModelProperty(value = "设备id")
    private String deviceId;
    @ApiModelProperty(value = "登录token")
    private String token;
    @ApiModelProperty(value = "app名")
    private String appName;
    @ApiModelProperty(value = "版本")
    private String version;
    @ApiModelProperty(value = "页数")
    private Integer pageNum;
    @ApiModelProperty(value = "页大小")
    private Integer pageSize;
}
