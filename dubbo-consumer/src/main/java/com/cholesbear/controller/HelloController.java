package com.cholesbear.controller;

import com.cholesbear.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XCY
 * @Date 2019/11/3
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/say")
    public String sayHello(String name ){
        String world = helloService.sayHello(name);
        log.info("world===========>{}",world);
        return world;
    }
}
