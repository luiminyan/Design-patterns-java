public class TrankDerVitalitaet extends TrankEffektDecorator{
    public TrankDerVitalitaet(Charakter c) {
        super(c, "TrankDerVitalitaet");
    }
    public int getRuestungswert(){
        return c.getRuestungswert();
    }
    public int getTrefferpunkte(){
        return c.getTrefferpunkte() + 10;
    }
}
