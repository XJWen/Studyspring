package springtrip.ch3.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * Scope session作用域是有WebApplicationContext来定义的
 * 代理模式通过ScopedProxyMode的设置来实现，如果注解类型为类使用ScopedProxyMode.TARGET_CLASS，
 * 如为接口ScopedProxyMode.INTERFACES
 * **/
@Component
@Scope(
        value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS
)
public class ShoppingCart {
}
