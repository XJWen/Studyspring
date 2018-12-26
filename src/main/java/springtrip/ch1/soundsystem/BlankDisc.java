package springtrip.ch1.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;

/**
 * 空CD，用来装填CD内容
 * **/
@PropertySource("classpath:dev/app.properties")
public class BlankDisc implements CompacDisc{
    /**
     * 唱片名称，艺术家，磁道即歌曲名
     * **/
    private String title;
    private String artist;
    private List<String> tracks;
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public BlankDisc(){}

    public BlankDisc(String title,String artist,List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public BlankDisc(
            @Value("${disc.title}") String title,
            @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("playing"+title+" by"+artist);
        for (String track : tracks){
            playTrack(track);
        }
    }

    @Override
    public void playTrack(String track){
        System.out.println("-track:"+track);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
