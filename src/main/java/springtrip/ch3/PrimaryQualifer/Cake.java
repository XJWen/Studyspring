package springtrip.ch3.PrimaryQualifer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Primary 首选项，只能表示一个优先的可选方案
 * **/
@Component
public class Cake implements Dessert{

    public Cake() {
    }

    @Bean
    @Primary
    public Dessert Cake(){
        return  new Cake();
    }
}
