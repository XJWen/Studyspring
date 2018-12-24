package springtrip.ch1.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  CD播放机
 * **/
@Component
public class CDPlayer   implements CompacDisc {
    private CompacDisc cd;

    /**
     * Autowired注入构造函数
     * **/
    @Autowired
    public CDPlayer(CompacDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {

    }

    /**
     * Autowired注入setter方法中
     * **/
    public void setCd(CompacDisc cd) {
        this.cd = cd;
    }
}
