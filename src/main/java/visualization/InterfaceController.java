package visualization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
import org.springframework.ui.Model;

@Controller
public class InterfaceController {
    @RequestMapping("/")
    public String index(Model model) {
	return "index";
    }
}
