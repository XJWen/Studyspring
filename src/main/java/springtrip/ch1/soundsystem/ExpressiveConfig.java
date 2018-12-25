package springtrip.ch1.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @PropertySource 声明属性源
 * **/
@Configuration
@PropertySource("classpath:dev/app.properties")
public class ExpressiveConfig {
    @Autowired
    Environment environment;

    /**
     * 通过Environment取属性
     * **/
    @Bean
    public BlankDisc disc(){
        return new BlankDisc(
                environment.getProperty("disc.title"),
                environment.getProperty("disc.artist")
        );
    }
}
