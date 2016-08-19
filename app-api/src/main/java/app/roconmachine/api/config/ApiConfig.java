package app.roconmachine.api.config;

import app.roconmachine.api.ApiApplication;
import app.roconmachine.api.endpoint.Ping;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by asus on 8/18/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = Ping.class)
public class ApiConfig extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(ApiApplication.class);
        return builder;
    }
}
