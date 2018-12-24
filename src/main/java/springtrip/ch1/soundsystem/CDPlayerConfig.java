package springtrip.ch1.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 自动装配
 * 组件扫描类
 * @Import 是属于JavaConfig配置，用来将两个配置类组合，但这种方法需要改进，耦合性大
 * **/
@ComponentScan
@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompacDisc compacDisc){
        return new  CDPlayer(compacDisc);
    }
}
