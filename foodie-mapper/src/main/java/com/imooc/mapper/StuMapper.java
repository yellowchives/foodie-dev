package com.imooc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shenguopin
 * @date 2022/4/4 11:08
 */
//mapper接口继承mybatisPlus提供的通用mapper,就可以使用基本的crud了
//还需要在启动类配置扫描mapper接口所在的包。因为在启动类加了@MapperScan，所以这里不需要@Component
    @Mapper
public interface StuMapper extends BaseMapper<Stu> {
}
