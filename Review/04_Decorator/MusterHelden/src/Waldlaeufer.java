public class Waldlaeufer implements Charakter{
    private int ruetungswert = 10;
    private int trefferpunkte = 20;

    @Override
    public int getRuestungswert() {
        return ruetungswert;
    }

    @Override
    public int getTrefferpunkte() {
        return trefferpunkte;
    }
}
