package app.roconmachine.com.config;

import app.roconmachine.com.ApiApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by asus on 8/18/2016.
 */

public class ApiConfig extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(ApiApplication.class);
        return builder;
    }
}
