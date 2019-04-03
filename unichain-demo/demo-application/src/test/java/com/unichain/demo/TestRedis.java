package com.unichain.demo;

import com.unichain.demo.nosql.RedisService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @program: TestRedis
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-02 11:57
 **/
public class TestRedis extends BaseTest {

    @Resource
    private RedisService redisService;

    @Test
    public void save(){
        redisService.set("key", "value");
        Assert.assertTrue(redisService.exists("key"));
    }

}
