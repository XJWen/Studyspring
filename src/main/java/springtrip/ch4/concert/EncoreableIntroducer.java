package springtrip.ch4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 通过注解引入新功能
 * **/
@Aspect
public class EncoreableIntroducer {
    /**
     * Performance+ 指代该接口的子类
     * defaultImpl = DefaultEncoreable.class 指定为引入功能提供实现的类
     * **/
    @DeclareParents(
            value = "springtrip.ch4.concert.Performance+",
            defaultImpl = DefaultEncoreable.class
    )
    public static Encoreable encoreable;
}
