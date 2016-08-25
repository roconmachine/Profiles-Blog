package app.roconmachine.api;

import app.roconmachine.api.endpoint.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by asus on 8/18/2016.
 */



@SpringBootApplication
@ComponentScan(basePackageClasses = GreetingController.class)
public class ApiApplication
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApiApplication.class, args);
    }
}
