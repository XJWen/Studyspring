package springtrip.ch4.concert;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("返场表演节目。");
    }
}
