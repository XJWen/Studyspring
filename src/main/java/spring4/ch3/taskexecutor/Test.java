package spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncService asyncService = context.getBean(AsyncService.class);

        for (int i =0;i<5;i++){
            asyncService.executeAsyncTask(i);
            asyncService.executeAsyncTaskPlus(i);
        }

        context.close();
    }
}
