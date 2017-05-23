package mock;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import pl.edu.agh.toik.ec.visualisation.Visualization;

@Component
public class MockStarter {
	private Random random = new Random();

	@Autowired
	private Visualization visualization;

	@Scheduled(fixedRate = 5000)
	public void publishMessage() {
		String message = "" + LocalDateTime.now() + ", " + random.nextDouble();
		System.out.println("[MockStarter] producing message: " + message);
		visualization.notify(message);
	}
}
