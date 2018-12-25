package springtrip.ch3.PrimaryQualifer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Qualifer 是限定符注解，通过自定义的限定符来避免spring自动化部署Bean歧义
 * **/
@Component
@Qualifier("cold")
public class IceCream implements Dessert{
}
