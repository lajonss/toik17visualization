package pl.edu.agh.toik.ec.visualisation;

import java.util.Observer;

public interface VisualizationStrategy {
    public void interpretMessage(Message message);
    public void addObserver(Observer o);
}
