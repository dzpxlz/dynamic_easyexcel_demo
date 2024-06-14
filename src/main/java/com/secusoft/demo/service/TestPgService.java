package com.secusoft.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.secusoft.demo.model.TestPg;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/8 18:21
 * @description：
 */
public interface TestPgService  extends IService<TestPg> {
    TestPg select();
}
