package com.ruoyi.controller;

import com.ruoyi.common.annotation.Anonymous;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 RuoYi 自定义注解 @Anonymous
 * 注意：
 *  1）该类路径需要保持和启动类路径一致  才能扫描到
 *
 *  http://localhost:1024/dev-api/abc
 *  http://127.0.0.1:8080/abc
 */
@RestController
public class TestController01 {

    @Anonymous
    @GetMapping("/abc")
    public String test01(){
        return "Test success";
    }
}
