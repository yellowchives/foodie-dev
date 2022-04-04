package com.imooc.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
/**
 * @author shenguopin
 * @date 2022/4/4 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stu {
    private Integer id;
    private String name;
    private Integer age;
}
