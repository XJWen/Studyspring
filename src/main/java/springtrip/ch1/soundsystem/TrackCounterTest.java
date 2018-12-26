package springtrip.ch1.soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springtrip.ch1.soundsystem.config.TrackCounterConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompacDisc compacDisc;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        compacDisc.playTrack("1");
        compacDisc.playTrack("2");
        compacDisc.playTrack("3");
        compacDisc.playTrack("2");
        compacDisc.playTrack("2");
        compacDisc.playTrack("4");
        compacDisc.playTrack("1");

        //断言期望数
        Assert.assertEquals(1,counter.getPlayCount("1"));
        Assert.assertEquals(3,counter.getPlayCount("2"));
        Assert.assertEquals(1,counter.getPlayCount("3"));
        Assert.assertEquals(1,counter.getPlayCount("4"));

    }
}
