package tech.codeforc.source.orm.io;

import java.io.InputStream;

/**
 * Author: Ifan·Huang
 * Description: 加载应用端配置文件、 提供读取应用端关键配置文件Mapper.xml及SqlMapperConfig.xml的功能。将配置文件加载成为字节输入流、存储在内存中
 **/
public class Resources {

    /**
     * 根据配置文件的路径，读取成字节流返回
     * @param path 配置文件路径
     * @return 字节流
     */
    public static InputStream getResourceAsSteam(String path) {
        return Resources.class.getClassLoader().getResourceAsStream(path);
    }
}
