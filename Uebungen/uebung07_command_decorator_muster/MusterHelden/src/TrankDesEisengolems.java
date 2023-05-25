public class TrankDesEisengolems extends TrankEffektDecorator{
    //constructor
    public TrankDesEisengolems(Charakter charakter) {
        super(charakter);
    }

    //implement methods from the interface character
    @Override
    public int getRuestungswert() {
        return charakter.getRuestungswert() - 5;
    }

    @Override
    public int getTrefferpunkte() {
        return charakter.getTrefferpunkte() + 5;
    }
}
