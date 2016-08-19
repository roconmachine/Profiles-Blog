package app.roconmachine.common;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by asus on 8/19/2016.
 */
public class Utils {
    public static Properties getPropertiesFromClassPath(String path) throws IOException{
        Resource resource = new ClassPathResource("/my.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        return props;
    }
}
