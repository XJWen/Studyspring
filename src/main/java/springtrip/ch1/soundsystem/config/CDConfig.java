package springtrip.ch1.soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springtrip.ch1.soundsystem.CompacDisc;
import springtrip.ch1.soundsystem.SgtPaggers;

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
