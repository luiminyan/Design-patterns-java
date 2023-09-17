public class TrankDesBarbaren extends TrankEffektDecorator{
    public TrankDesBarbaren(Charakter c) {
        super(c, "TrankDesBarbaren");
    }
    public int getRuestungswert(){
        return c.getRuestungswert() - 5;
    }
    public int getTrefferpunkte(){
        return c.getTrefferpunkte() + 5;
    }
}
