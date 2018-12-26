package springtrip.ch1.soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springtrip.ch1.soundsystem.BlankDisc;
import springtrip.ch1.soundsystem.CompacDisc;
import springtrip.ch1.soundsystem.TrackCounter;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompacDisc sgtPeggers(){
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        blankDisc.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("Lucy in the Sky with Diamods");
        tracks.add("Fixing a Hole");
        tracks.add("With a Little Help form My friends");
        tracks.add("Getting Better");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
