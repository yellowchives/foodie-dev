package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shenguopin
 * @date 2022/4/3 22:26
 */
@SpringBootApplication
//扫描mapper接口所在的包
@MapperScan(basePackages = "com.imooc.mapper")
public class FoodieApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodieApplication.class, args);
    }
}
