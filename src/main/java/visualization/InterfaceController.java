package visualization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
public class InterfaceController {
    @RequestMapping("/")
    public String index(Map<String, Object> model) {
	return "/webapp/index.html";
    }
}
