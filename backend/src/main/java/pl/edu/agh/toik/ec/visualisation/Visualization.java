package pl.edu.agh.toik.ec.visualisation;

import java.util.Observer;

public interface Visualization extends Observer {
	void notify(String message);
	VisualizationType getType();
}
