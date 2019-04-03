package com.unichain.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unichain.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: UserMapper
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-01 14:44
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();
}
