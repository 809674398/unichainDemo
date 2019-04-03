package com.unichain.demo.pojo.dto;

import com.unichain.demo.pojo.BaseInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @program: UserDto
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-03 15:52
 **/
@Data
public class UserDto extends BaseInfo{

    @ApiModelProperty("用户姓名")
    @NotBlank(message = "用户姓名不能为空")
    private String name;
}
