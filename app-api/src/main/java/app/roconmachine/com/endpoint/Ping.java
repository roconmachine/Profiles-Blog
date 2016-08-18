package app.roconmachine.com.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asus on 8/18/2016.
 */

@RestController
@RequestMapping(value = "/api")
public class Ping {

    @RequestMapping(value = "/ping")
    public String ping() throws Exception{
        return "ping success";
    }
}
