package spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @MyAction(name = "注解式的add操作")
    public void add(){}
}
