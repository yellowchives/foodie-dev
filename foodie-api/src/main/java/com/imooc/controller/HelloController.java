package com.imooc.controller;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shenguopin
 * @date 2022/4/3 22:28
 */
@RestController
public class HelloController {

    @Resource
    private StuMapper stuMapper;

    @GetMapping("/hello")
    public String sayHello() {
        Stu stu = stuMapper.selectById(1203);
        System.out.println(stu);
        return "hello world";
    }
}
