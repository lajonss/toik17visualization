package pl.edu.agh.toik.ec.visualisation;

import java.util.Observable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class VisualizationImpl implements Visualization {
	private VisualizationStrategy strategy;
	private VisualizationType type;

	@Autowired
	private SimpMessagingTemplate template;

	public VisualizationImpl(VisualizationStrategy strategy, VisualizationType type) {
		this.strategy = strategy;
		this.type = type;
		strategy.addObserver(this);
	}

	@Override
	public void notify(String message) {
		strategy.addObserver(this);
		strategy.interpretMessage(new Message(message));
	}

	@Override
	public void update(Observable o, Object arg) {
		template.convertAndSend("/fitness", arg);
	}

	@Override
	public VisualizationType getType() {
		return type;
	}
}
