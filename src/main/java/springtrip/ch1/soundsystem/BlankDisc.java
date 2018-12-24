package springtrip.ch1.soundsystem;

import java.util.List;

/**
 * 空CD，用来装填CD内容
 * **/
public class BlankDisc implements CompacDisc{
    /**
     * 唱片名称，艺术家，磁道即歌曲名
     * **/
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title,String artist,List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("playing"+title+" by"+artist);
        for (String track : tracks){
            System.out.println("-track:"+track);
        }
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
