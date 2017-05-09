package visualization;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


@Configuration
public class SpringConfiguration {
    @Bean
    @Scope("singleton")
    public Visualization visualization() {
	return new Visualization();
    }
}
