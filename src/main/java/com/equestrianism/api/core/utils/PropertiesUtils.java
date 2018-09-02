package com.equestrianism.api.core.utils;

import org.apache.log4j.Logger;
import org.apache.poi.util.StringUtil;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

/**
 * Created by Chenzq on 2018/9/2.
 */
public class PropertiesUtils {

    private static Logger log = Logger.getLogger(PropertiesUtils.class);

    /** 资源属性 */
    private static Properties properties;

    /**
     * 私有构造方法
     */
    private PropertiesUtils() {
    }

    static {
        properties = new Properties();
        try {
            // 读取配置文件
            properties.load(PropertiesUtils.class.getClassLoader().getResourceAsStream("config/server.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error("读取配置文件出错，请确认properties文件已经放在目录下。");
        }
    }

    /**
     * 获取配置信息
     *
     * @param key 键
     * @return 配置信息
     */
    public static String getValue(String key) {
        return properties.getProperty(key);
    }

    /**
     * 获取配置信息
     *
     * @param key 键
     * @param param 参数
     * @return 配置信息
     */
    public static String getValue(String key, Object[] param) {
        String value = getValue(key);
        return MessageFormat.format(value, param);
    }

}
