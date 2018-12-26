package springtrip.ch4.concert;

/**
 * AspectJ 切面
 * **/
public aspect CriticAspect {
    private CriticismEngine engine;

    public CriticAspect(){}

    pointcut perform() : execution(* springtrip.ch4.concert.Performance.perform(..));

    after():perform(){
        System.out.println(engine.getCriticism());
    }

    public void setEngine(CriticismEngine engine) {
        this.engine = engine;
    }
}
