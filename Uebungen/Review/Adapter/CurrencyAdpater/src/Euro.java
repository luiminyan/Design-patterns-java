public class Euro implements Waehrung{
    private double wert;
    public Euro(double wert){
        this.wert = wert;
    }
    // implements functions from interface
    @Override
    public String getTyp() {
        return "Euro";
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
