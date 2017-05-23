package pl.edu.agh.toik.ec.visualisation.strategy;

import pl.edu.agh.toik.ec.visualisation.Message;

public class AllStrategy extends AbstractStrategy {

	@Override
	public void interpretMessage(Message message) {
		this.setChanged();
		notifyObservers(message);
	}

}
