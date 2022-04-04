package com.imooc;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author shenguopin
 * @date 2022/4/4 12:15
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {
    @Autowired
    private StuMapper stuMapper;

    @Test
    public void test() {
        List<Stu> stus = stuMapper.selectList(null);
        stus.forEach(System.out::println);
    }
}
