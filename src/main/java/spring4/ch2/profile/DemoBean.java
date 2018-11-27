package spring4.ch2.profile;

public class DemoBean {

    private String context;

    public DemoBean(String context){
        super();
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
