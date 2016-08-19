package app.roconmachine.api.endpoint;

import app.roconmachine.common.Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * Created by asus on 8/18/2016.
 */

@RestController
@RequestMapping(value = "/api")
public class Ping {

    @RequestMapping(value = "/ping")
    public String ping() throws Exception{
        Properties pr = Utils.getPropertiesFromClassPath("message.propeprties");

        return pr.getProperty("success");
    }
}
