package springtrip.ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Profile注解在类级别上，只有在dev profile激活时这个类才会被创建
 * **/
@Configuration
@Profile("dev")
public class DevProfileConfig {

    /**
     * EmbeddedDatabaseBuilder搭建一个嵌入式Hyperson数据库，模式(schema)定义在schema.sql文件中
     * 测试数据则是由text-data.sql加载
     * **/
    @Bean(destroyMethod = "shutdown")
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:text-data.sql")
                .build();
    }
}
