package visualization;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisualizationController {
    @Autowired
    private Visualization visualization;

    @RequestMapping("/messages")
    public List<Message> messages() {
        return visualization.getMessages();
    }
}
