public class TrankDesBarbaren extends TrankEffektDecorator{
    //constructor
    public TrankDesBarbaren(Charakter charakter) {
        super(charakter);
    }

    //implements function from interface Charakter
    @Override
    public int getRuestungswert() {
        return charakter.getRuestungswert() * 2;
    }

    @Override
    public int getTrefferpunkte() {
        return charakter.getTrefferpunkte();
    }
}
