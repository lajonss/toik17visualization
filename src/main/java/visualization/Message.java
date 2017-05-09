package visualization;

import java.time.LocalDate;

public class Message {
    private LocalDate timestamp;
    private Double fitness;

    public Message(LocalDate timestamp, Double fitness) {
	this.timestamp = timestamp;
	this.fitness = fitness;
    }

    public LocalDate getTimestamp() { return timestamp; }
    public Double getFitness() { return fitness; }
}
