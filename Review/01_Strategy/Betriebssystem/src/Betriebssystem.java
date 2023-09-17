public class Betriebssystem {
//    attribute strategy
    private BetriebssystemStrategy betriebssystemStrategy;
    public Betriebssystem(BetriebssystemStrategy betriebssystemStrategy){
        this.betriebssystemStrategy = betriebssystemStrategy;
    }
    public String getOS(){
        return betriebssystemStrategy.getOS();
    }
}
