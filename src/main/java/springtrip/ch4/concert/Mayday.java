package springtrip.ch4.concert;


public class Mayday implements Performance{
    @Override
    public void perform() {
        System.out.println("五月天登台演出");
    }
}
