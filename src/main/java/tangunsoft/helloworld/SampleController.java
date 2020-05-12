package tangunsoft.helloworld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping(value="/")
    @ResponseBody
    public String sampleHome() {

        return "Hello Tangunsoft. Hello ETRI.";

    }
}

