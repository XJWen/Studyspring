package springtrip.ch3.PrimaryQualifer;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target 注解适用的范围
 * Retention 注解使用的时间
 * **/
@Target({
        ElementType.TYPE,ElementType.METHOD,
        ElementType.FIELD,ElementType.CONSTRUCTOR
})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Crispy {
}
