package mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pl.edu.agh.toik.ec.visualisation.Visualization;
import pl.edu.agh.toik.ec.visualisation.VisualizationImpl;
import pl.edu.agh.toik.ec.visualisation.strategy.AllStrategy;
import pl.edu.agh.toik.ec.visualisation.type.LogType;

@Configuration
@ComponentScan("pl.edu.agh.toik.ec")
public class MockConfiguration {
    @Bean
    @Scope("singleton")
    public Visualization visualization() {
    	return new VisualizationImpl(new AllStrategy(), new LogType());
    }

}