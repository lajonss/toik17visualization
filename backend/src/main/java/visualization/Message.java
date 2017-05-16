package visualization;

import java.time.LocalDateTime;

public class Message {
    private LocalDateTime timestamp;
    private Double fitness;

    public Message(LocalDateTime timestamp, Double fitness) {
	this.timestamp = timestamp;
	this.fitness = fitness;
    }

    public LocalDateTime getTimestamp() { return timestamp; }
    public Double getFitness() { return fitness; }
}
