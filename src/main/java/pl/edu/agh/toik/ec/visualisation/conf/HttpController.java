package pl.edu.agh.toik.ec.visualisation.conf;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.edu.agh.toik.ec.visualisation.Visualization;

@CrossOrigin(origins = "*")
@RestController
public class HttpController {
	@Autowired
	private Visualization visualization;

	@RequestMapping("/config")
	public ConfigEndpoint getVisualizationType() {
		ConfigEndpoint ce = new ConfigEndpoint();
		ce.type = visualization.getType().getClass().getSimpleName();
		ce.biggerFitnessIsBetter = true; // TODO link with algorithm module
		return ce;
	}

	private class ConfigEndpoint implements Serializable {
		public String type;
		public Boolean biggerFitnessIsBetter;
	}
}
