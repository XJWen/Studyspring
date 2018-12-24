package springtrip.ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * Profil 为prod时激活
 * **/
@Configuration
@Profile("prod")
public class ProdProfileConfig {

    /**
     * 通过JNDI来构建datasource
     * **/
    @Bean
    public DataSource dataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean =
                new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/MyDs");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(
                javax.sql.DataSource.class
        );
        return (DataSource)jndiObjectFactoryBean.getObject();
    }
}
