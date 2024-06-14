package com.secusoft.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.secusoft.demo.model.TestMysql;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/8 17:49
 * @description：
 */
@Mapper
public interface TestMysqlMapper  extends BaseMapper<TestMysql> {

    TestMysql select();
}
