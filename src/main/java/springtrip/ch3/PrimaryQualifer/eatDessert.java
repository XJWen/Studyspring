package springtrip.ch3.PrimaryQualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class eatDessert {
    private Dessert dessert;

    @Autowired
    @Qualifier("cold")
    //@Crispy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
