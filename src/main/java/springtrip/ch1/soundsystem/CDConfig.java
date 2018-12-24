package springtrip.ch1.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 从CDPlayerConfig中剥离compacDisc
 * **/
@Configuration
public class CDConfig {
    @Bean
    public CompacDisc compacDisc(){
        return new SgtPaggers();
    }
}
