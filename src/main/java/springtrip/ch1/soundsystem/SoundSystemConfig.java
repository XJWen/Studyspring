package springtrip.ch1.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 设置一个顶级的配置文件，用来将零散的配置类组合
 * @ImportResource 是JavaConfig引用xml配置文件的关键
 * **/
@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
@ImportResource("classpath:dev/cd-config.xml")
public class SoundSystemConfig {
}
