package spring4.ch3.enable_;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(AspectJAutoProxyRegistrar.class)
public @interface EnableAspectJAuthoProxy {
}
