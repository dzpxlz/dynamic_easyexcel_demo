package com.secusoft.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.secusoft.demo.mapper.TestMysqlMapper;
import com.secusoft.demo.model.TestMysql;
import com.secusoft.demo.service.TestMysqlService;

import org.springframework.stereotype.Service;



/**
 * @author ：dzp
 * @date ：Created in 2024/5/8 18:08
 * @description：
 */
@Service
public class TestMysqlServiceImpl extends ServiceImpl<TestMysqlMapper, TestMysql> implements TestMysqlService {


    @Override
    public TestMysql select() {
        return this.baseMapper.select();
    }
}
