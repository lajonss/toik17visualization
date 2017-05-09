package visualization;

import java.time.LocalDate;
import java.util.Random;

import visualization.Message;
import visualization.Visualization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.apache.tomcat.util.bcel.Const;

@Component
public class Starter {
    private Random random = new Random();
    
    @Autowired
    private Visualization visualization;
    
    @Scheduled(fixedRate = 5000)
    public void publishMessage() {
	visualization.notify(new Message(LocalDate.now(), random.nextDouble()));
    }
}
