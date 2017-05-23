package pl.edu.agh.toik.ec.visualisation.strategy;

import pl.edu.agh.toik.ec.visualisation.Message;

public class CertainWorkerStrategy extends AbstractStrategy {
	private String workerId;
	public CertainWorkerStrategy(String workerId) { this.workerId = workerId; }

	@Override
	public void interpretMessage(Message message) {
		if(message.workerId.equals(workerId))
			notifyObservers(message);
	}

}
