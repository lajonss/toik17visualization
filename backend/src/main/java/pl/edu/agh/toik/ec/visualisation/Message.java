package pl.edu.agh.toik.ec.visualisation;

import java.util.Random;

public class Message {
	public String workerId;
	public int timestamp;
	public double fitness;
	
	public Message(String rawData) {
		//TODO implement
		Random random = new Random();
		workerId = "" + random.nextInt(4);
		timestamp = (int) (System.currentTimeMillis() / 1000);
		fitness = random.nextDouble();
	}
}
