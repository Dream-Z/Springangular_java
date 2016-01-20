package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lexx on 1/18/16.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
