package springtrip.ch4.concert;

public class CriticismEngineImpl implements CriticismEngine{
    public String[] criticismPool;

    CriticismEngineImpl(){}

    @Override
    public String getCriticism() {
        int n = (int)(Math.random()*criticismPool.length);
        return criticismPool[n];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
