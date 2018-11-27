package spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigEL.class);

        ConfigEL resourceService = context.getBean(ConfigEL.class);

        resourceService.outputResource();
        context.close();
    }
}
