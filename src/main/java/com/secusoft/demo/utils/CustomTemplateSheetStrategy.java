package com.secusoft.demo.utils;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;

/**
 * @author ：dzp
 * @date ：Created in 2024/5/17 14:25
 * @description：需要自定义拦截器
 */
public class CustomTemplateSheetStrategy implements SheetWriteHandler {
    private Integer sheetNo;
    private String sheetName;
    public CustomTemplateSheetStrategy(String sheetName) {
        this.sheetName = sheetName;
    }
    public CustomTemplateSheetStrategy(Integer sheetNo, String sheetName) {
        this.sheetNo = sheetNo;
        this.sheetName = sheetName;
    }
    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
    }
    /**
     * 功能：动态修改模板中sheet的名称
     * sheet创建完成后调用
     * @param writeWorkbookHolder
     * @param writeSheetHolder
     */
    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        if (sheetName == null) {
            return;
        }
        if (sheetNo == null) {
            sheetNo = 0;
        }
        writeWorkbookHolder.getCachedWorkbook().setSheetName(sheetNo, sheetName);
    }

}
