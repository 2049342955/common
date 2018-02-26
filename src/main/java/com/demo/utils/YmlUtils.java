package com.demo.utils;


import com.fasterxml.jackson.dataformat.yaml.snakeyaml.Yaml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * author : Sdniu
 * date   : 2017/7/12.
 * description :
 */
public class YmlUtils {
    public static Map<String, Map> yamls = new HashMap<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(YmlUtils.class);

    public static String getPropertyByName(String yamlPath, String name) throws IOException {
        LOGGER.info("load YML path is {},name is {}", yamlPath, name);
        if (yamls.get(yamlPath) == null) {
            Yaml yaml = new Yaml();
            InputStream ins = YmlUtils.class.getClassLoader().getResourceAsStream(yamlPath);
            if (ins != null) {
                //获取test.yaml文件中的配置数据，然后转换为map，
                Map map = (Map) yaml.load(ins);
                yamls.put(yamlPath, map);
            }
        }
        Map map = yamls.get(yamlPath);
        String names[] = name.split("\\.");
        Map tmp = map;
        for (int i = 0; i < names.length; i++) {
            if (i != names.length - 1) {
                tmp = (Map) tmp.get(names[i]);
            } else {
                return (String) tmp.get(names[i]);
            }

        }
        return null;
    }

    public static Map getApplicationYml(String yamlPath) throws IOException {
        if (yamls.get(yamlPath) == null) {
            Yaml yaml = new Yaml();
            URL url = YmlUtils.class.getClassLoader().getResource(yamlPath);
            if (url != null) {
                //获取test.yaml文件中的配置数据，然后转换为obj，
                Map map = (Map) yaml.load(new FileInputStream(url.getFile()));
                yamls.put(yamlPath, map);
            }
        }
        return yamls.get(yamlPath);
    }

}
