public class Magier implements Charakter{
    private int ruetungswert = 3;
    private int trefferpunkte = 8;

    @Override
    public int getRuestungswert() {
        return ruetungswert;
    }

    @Override
    public int getTrefferpunkte() {
        return trefferpunkte;
    }
}
