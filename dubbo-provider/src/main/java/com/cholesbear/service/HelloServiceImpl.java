package com.cholesbear.service;


import org.apache.dubbo.config.annotation.Service;

/**
 * @Author XCY
 * @Date 2019/11/3
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello"+ name;
    }
}
