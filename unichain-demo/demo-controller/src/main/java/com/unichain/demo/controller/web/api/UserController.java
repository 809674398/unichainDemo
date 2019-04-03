package com.unichain.demo.controller.web.api;

import com.unichain.demo.pojo.dto.UserDto;
import com.unichain.framework.mvc.annotation.Access;
import com.unichain.framework.mvc.controller.ResponseMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: UserController
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-03 15:49
 **/
@RestController
@RequestMapping("/")
@Validated
public class UserController {

    @ApiOperation("查询用户")
    @RequestMapping("/query")
    @Access(ignoreToken = true)
    public ResponseMessage query(@RequestBody @Valid UserDto dto){
        return ResponseMessage.ok();
    }
}
