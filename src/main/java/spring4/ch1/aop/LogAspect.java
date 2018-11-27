package spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(spring4.ch1.aop.MyAction)")
    public void annotationPointCut(){}

    @Before("execution(* spring4.ch1.aop.DemoMethodService.*(..))")//拦截规则的空格需注意
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)
                joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截,"+method.getName());
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)
                joinPoint.getSignature();
        Method method = signature.getMethod();
        MyAction action = method.getAnnotation(MyAction.class);
        System.out.println("注解式拦截"+action.name());
    }
}
