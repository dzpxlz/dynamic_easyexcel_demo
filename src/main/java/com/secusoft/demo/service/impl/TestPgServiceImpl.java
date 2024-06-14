package com.secusoft.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.secusoft.demo.mapper.TestPgMapper;
import com.secusoft.demo.model.TestPg;
import com.secusoft.demo.service.TestPgService;
import org.springframework.stereotype.Service;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/8 18:21
 * @description：
 */
@Service
@DS("slave_1")
public class TestPgServiceImpl  extends ServiceImpl<TestPgMapper, TestPg> implements TestPgService {

    @Override
    public TestPg select() {
        return this.baseMapper.select();
    }
}
