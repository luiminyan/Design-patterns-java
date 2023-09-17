public class Pfund implements Waehrung{
    private double wert;
    public Pfund(double wert){
        this.wert = wert;
    }

    @Override
    public String getTyp() {
        return "Pfund";
    }

    @Override
    public double getWert() {
        return wert;
    }

    @Override
    public double getWertInEUR() {
        return wert;
    }
}
