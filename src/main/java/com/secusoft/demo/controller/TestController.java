package com.secusoft.demo.controller;




import com.secusoft.demo.model.TestPg;
import com.secusoft.demo.service.TestMysqlService;
import com.secusoft.demo.service.TestPgService;
import com.secusoft.demo.model.TestMysql;
import com.secusoft.demo.utils.CommonUtlis;
import com.secusoft.demo.utils.EasyExportUtil;
import com.secusoft.demo.utils.ExcelData3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/7 11:49
 * @description：
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestMysqlService testMysqlService;
    @Resource
    private TestPgService testPgService;



    @GetMapping("/sql")
    public Object sql() {
        TestMysql testMysql = testMysqlService.select();
        TestPg testPg = testPgService.select();
        List<Object> list=new ArrayList<>();
        list.add(testMysql);
        list.add(testPg);
        return list;
    }


    @GetMapping("/export")
    public void exportDeviceList(HttpServletResponse response) {

        List<ExcelData3> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            ExcelData3 excelData3 = new ExcelData3();
            excelData3.setA("testA");
            excelData3.setB("testB");
            excelData3.setC("testC");
            excelData3.setD("testD");
            excelData3.setE("testE");
            excelData3.setF("testF");
            excelData3.setG("testG");
            excelData3.setH("testH");
            excelData3.setI("testI");
            list.add(excelData3);
        }
        EasyExportUtil.exportWithTemplate(System.currentTimeMillis() + ".xlsx", response, "我是一个sheetName", CommonUtlis.resolvePath("test.xlsx"), list);
    }
}

