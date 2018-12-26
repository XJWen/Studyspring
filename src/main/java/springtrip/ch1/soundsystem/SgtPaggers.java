package springtrip.ch1.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 标准组件类,Sgt. Pegger的唱片
 * **/
@Component("setPaggers")
public class SgtPaggers implements CompacDisc{
    private String title = "Sgt. Pegger's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public SgtPaggers(){}

    @Override
    public void play() {
        System.out.println("Playing"+title+" on"+artist);
    }

    @Bean
    public CompacDisc sgetPeppers(){
        return new SgtPaggers();
    }

    /**
     * javaConfig注入
     * 通过传入，Bean注入sgetPeppers()，不会重复调用sgetPeppers()
     * **/
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgetPeppers());
    }

    /**
     * 这个方法返回的Bean和上面的Bean完全一致（因为默认情况下Spring的bean是单例的）
     * SgetPeppers实例是相同的
     * **/
    @Bean
    public CDPlayer anothercdPlayer(){
        return new CDPlayer(sgetPeppers());
    }

    /**
     * 随机选择CD
     * **/
    @Bean
    public CompacDisc randomBeatlesCD(){
        int choics = (int) Math.floor(Math.random()*4);
        if (choics==0){
            return new SgtPaggers();
        }else {
            return null;
        }
    }
}
