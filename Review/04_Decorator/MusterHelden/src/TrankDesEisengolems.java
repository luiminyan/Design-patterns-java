public class TrankDesEisengolems extends TrankEffektDecorator{
    public TrankDesEisengolems(Charakter c) {
        super(c, "TrankDesEisengolems");
    }
    public int getRuestungswert(){
        return c.getRuestungswert() * 2;
    }
    public int getTrefferpunkte(){
        return c.getTrefferpunkte();
    }

}
