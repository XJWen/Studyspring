package springtrip.ch4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
/**
 * Spring ApsectJ 纯POJO切面
 * @author xjWen
 * **/
@Aspect
public class Audience {
    /**
     * public 对象或类对外的一种接口方式
     *protected 保护子类，不向外部包展示
     * default 对本包的类和接口展示，但子类和外包不行
     * private 只对本类展示
     * **/
    Audience(){}

    /**
     * 将切点表达式定义到切面的一个方法体中，以便调用
     * **/
    @Pointcut("execution(* springtrip.ch4.concert.Performance.perform(..))")
    public  void perform(){}

    /**
     * 连接点方法执行之前执行该切面方法
     * **/
//    @Before("perform()")
    public void silenceCellPhones(){
       System.out.println("演出前观众手机静音。");
    }

//    @Before("perform()")
    public void takeSeats(){
        System.out.println("演出前观众入席。");
    }

    /**
     * 连接点方法返回参数之后执行该切面方法
     * **/
/*    @AfterReturning("perform()")
    public void applause(){
        System.out.println("演出成功后观众鼓掌喝彩。");
    }*/

    /**
     * 连接点方法抛出异常之后执行该切面方法
     * **/
    /*@AfterThrowing("perform()")
    public void demandRefund(){
        System.out.println("演出失败后观众要求退票。");
    }*/
    /**
     * 环绕通知
     * ProceedingJoinPoint 被通知方法的连接点，即切点
     * **/
    @Around("perform()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("演出前观众入席。");
            System.out.println("演出前观众手机静音。");
            //被通知方法执行
            joinPoint.proceed();
            System.out.println("演出成功后观众鼓掌喝彩。");
        }catch (Throwable e){
            System.out.println("演出失败后观众要求退票。");
        }
    }
}
