package com.roconmachine.commons;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by roconmachine@gmail.coms on 8/20/16.
 */
public class Utils {
    public static Properties getPropertiesFromClassPath(String path) throws IOException {
        Resource resource = new ClassPathResource(path);
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        return props;
    }
}
