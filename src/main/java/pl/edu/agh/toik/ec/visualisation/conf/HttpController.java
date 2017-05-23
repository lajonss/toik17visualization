package pl.edu.agh.toik.ec.visualisation.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.edu.agh.toik.ec.visualisation.Visualization;

@CrossOrigin(origins="*")
@RestController
public class HttpController {
	@Autowired
	private Visualization visualization;
	
	@RequestMapping("/type")
	public String getVisualizationType() {
		return visualization.getType().getClass().getSimpleName();
	}
}
