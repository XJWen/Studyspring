package springtrip.ch3.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ConfigurableBeanFactory.SCOPE_PROTOTYPE  原型，每次注入bean就创建一个实例
 * ConfigurableBeanFactory.SCOPE_SINGLETON  单例，每次注入bean都用同一个实例
 * **/
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Noteped {
}
