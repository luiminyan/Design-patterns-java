public class Waldlaeufer implements Charakter{
    //„Waldläufer“ haben anfangs 10 Rüstung und 20 Trefferpunkte
    //attribute
    private int ruesting = 10;
    private int trefferpunkte = 20;

    //implements methods from interface Charakter
    @Override
    public int getRuestungswert() {
        return ruesting;
    }

    @Override
    public int getTrefferpunkte() {
        return trefferpunkte;
    }
}
