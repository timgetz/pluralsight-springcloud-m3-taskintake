package pluralsight.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by timge on 12/5/2016.
 */
@Configuration
public class TaskConfig {

    @Bean
    public TaskProcessor taskProcessor() {
        return new TaskProcessor();
    }

}
