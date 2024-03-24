package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public String setRedis(){
        stringRedisTemplate.opsForValue().set("username","jaychou");
        return "redis 存储成功";
    }

    @RequestMapping("/get")
    public String getRedis(){
        String value = stringRedisTemplate.opsForValue().get("username");
        return value;
    }
}
