public class Magier implements Charakter{
    //attributes
    private int ruesting = 3;
    private int trefferpunkte = 8;

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
