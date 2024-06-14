package com.secusoft.demo.utils;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


/**
 * @author dzp
 * @data 2019/7/8
 */
public class CommonUtlis {

    private final static Logger logger = LoggerFactory.getLogger(CommonUtlis.class);

    private final static  String url = "https://api.map.baidu.com/geoconv/v1/";

    public static String resolvePath(String filename) {
        // 获取当前工作目录
        String currentDir = System.getProperty("user.dir");

        // 构建文件夹路径
        String configFolderPath = currentDir + File.separator + "config";

        // 检查 config 文件夹是否存在，如果不存在，则创建它
        File configFolder = new File(configFolderPath);
        if (!configFolder.exists()) {
            configFolder.mkdirs(); // 创建文件夹及其父文件夹
        }

        // 构建文件路径
        String filePath = configFolderPath + File.separator + filename;

        // 创建文件对象
        File file = new File(filePath);

        // 检查文件是否存在
        if (!file.exists()) {
            // 文件不存在，可以选择抛出异常或返回特殊值
            throw new IllegalArgumentException("File not found: " + filename);
            // 或者返回 null 或者空字符串
            // return null;
        }

        // 返回文件的绝对路径
        return file.getAbsolutePath();
    }

}
