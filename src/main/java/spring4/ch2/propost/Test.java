package spring4.ch2.propost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring4.ch2.scope.ConfigScope;

public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
