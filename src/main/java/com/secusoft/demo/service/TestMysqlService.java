package com.secusoft.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.secusoft.demo.model.TestMysql;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/8 18:08
 * @description：
 */
public interface TestMysqlService extends IService<TestMysql> {
    TestMysql select();
}
