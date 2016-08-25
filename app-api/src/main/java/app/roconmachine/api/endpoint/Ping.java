package app.roconmachine.api.endpoint;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.roconmachine.commons.Utils;

import java.util.Properties;

/**
 * Created by asus on 8/18/2016.
 */

@RestController
@RequestMapping("/api")
public class Ping {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() throws Exception{
        Properties pr = Utils.getPropertiesFromClassPath("message.propeprties");

        return pr.getProperty("success");
//        return "ping success";
    }
}
