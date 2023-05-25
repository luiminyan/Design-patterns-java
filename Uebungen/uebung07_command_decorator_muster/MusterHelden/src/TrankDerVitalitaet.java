public class TrankDerVitalitaet extends TrankEffektDecorator{
    //constructor
    public TrankDerVitalitaet(Charakter charakter) {
        super(charakter);
    }

    //implements the methods from interface charackter
    @Override
    public int getRuestungswert() {
        return charakter.getRuestungswert();
    }

    @Override
    public int getTrefferpunkte() {
        return charakter.getTrefferpunkte() + 10;
    }
}
