package springtrip.ch3.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * **/
@Component
public class ShoppingService {
    /**
     * ShoppingCart为代理
     * **/
    private ShoppingCart shoppingCart;


    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
