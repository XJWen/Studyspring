package springtrip.ch3.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 在Condition中检查是否存在magic属性
 * **/
public class MagicExistsCondition implements Condition {
    /**
     * ConditionContext可以获取很多相关东西，详见接口定义
     * AnnotatedTypeMetadata 可以获取注解的属性和判断是否存在@Bean之外的其他特殊1注解
     * **/
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        return environment.containsProperty("magic");
    }
}
