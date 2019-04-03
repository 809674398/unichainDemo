package com.unichain.demo.service.support.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @program: BaseServiceImpl
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-03-28 22:06
 **/
public abstract class BaseServiceImpl<M extends BaseMapper<T>,T> extends ServiceImpl<M, T> {
}
