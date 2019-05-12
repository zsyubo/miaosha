package org.imooc.mall.controller;

import org.imooc.mall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Resource(name = "redisTemplate")
    ValueOperations valueOperations;

    @Autowired
    IGoodsService goodsService;

    @GetMapping("/get")
    public Object hello() {
        return goodsService.getHello();
    }

    @GetMapping("/redis")
    public Object redisGet(String name) {
        valueOperations.set("SB", name);
        return valueOperations.get("SB");
    }

}
