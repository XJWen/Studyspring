package springtrip.ch1.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *  CD播放机
 * **/
@Component
public class CDPlayer   implements CompacDisc {
    private CompacDisc compacDisc;

    /**
     * Autowired注入构造函数
     * **/
    @Autowired
    public CDPlayer(CompacDisc compacDisc){
        this.compacDisc = compacDisc;
    }

    @Override
    public void play() {

    }

    /**
     * Autowired注入setter方法中
     * **/
    @Autowired
    public void setCompacDisc(CompacDisc cd) {
        this.compacDisc = cd;
    }
}
