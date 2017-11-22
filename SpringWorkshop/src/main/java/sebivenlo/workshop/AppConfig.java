package sebivenlo.workshop;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring uses this class for configuring and enabling additional features like JPA.
 * 
 * @author merve
 */
@Configuration
@EnableJpaRepositories
public class AppConfig {
}
