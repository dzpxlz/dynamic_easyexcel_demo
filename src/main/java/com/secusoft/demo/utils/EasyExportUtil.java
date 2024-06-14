package com.secusoft.demo.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.alibaba.excel.write.metadata.fill.FillWrapper;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.poi.ss.formula.functions.T;


import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/6 17:24
 * @description：
 */

public class EasyExportUtil {




    /**
     * 指定流输出
     * @param fileName
     * @param response
     * @param sheetName
     * @param templateFileName
     * @param list
     * @param <T>
     */
    public static <T>  void exportWithTemplate(String fileName,HttpServletResponse response, String sheetName, String templateFileName, List<T> list) {
        try {
            response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try (ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).withTemplate(templateFileName).registerWriteHandler(new CustomTemplateSheetStrategy(0,sheetName)).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet().build();

            FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
            excelWriter.fill(list, fillConfig, writeSheet);
            Map<String, Object> map = new HashMap<>();
            map.put("date", "2019年10月9日13:28:28");
            map.put("total", 1000);
            excelWriter.fill(map, writeSheet);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}

