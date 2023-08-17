public class Konto {
    // attributes
    private String kontoInhaber;
    private double betrag;

    // constructor
    public Konto(String kontoInhaber, double betrag) {
        this.kontoInhaber = kontoInhaber;
        this.betrag = betrag;
    }

    // getters
    public String getKontoInhaber() {
        return kontoInhaber;
    }

    public double getBetrag() {
        return betrag;
    }

}