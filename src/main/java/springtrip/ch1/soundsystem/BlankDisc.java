package springtrip.ch1.soundsystem;

/**
 * 空CD，用来装填CD内容
 * **/
public class BlankDisc implements CompacDisc{
    private String title;
    private String artist;

    public BlankDisc(String title,String artist){
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println();
    }
}
