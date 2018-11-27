package spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService0 awareService0 = context.getBean(AwareService0.class);
        awareService0.outputResult();

        context.close();
    }
}
