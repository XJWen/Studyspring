package springtrip.ch1.soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计每个磁道的使用次数
 * **/
@Aspect
public class TrackCounter {
    //磁道统计数列表
    private Map<String,Integer> tracksCounts = new HashMap<>();

    /**
     * 切点放在接口抽象方法中，能使得继承其的类出现切口
     * **/
    @Pointcut("execution(* springtrip.ch1.soundsystem.CompacDisc.playTrack(String))" +
            "&& args(trackName)")
    void  trackPlayed(String trackName){}

    @Before("trackPlayed(trackName)")
    public void countTrack(String trackName){
        int currentTrack = getPlayCount(trackName);
        tracksCounts.put(trackName,currentTrack+1);
    }

    public int getPlayCount(String trackName){
        //containsKey 判断当前key是否存在
        return tracksCounts.containsKey(trackName)
                ?tracksCounts.get(trackName):0;
    }
}
