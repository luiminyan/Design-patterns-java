public class Euro implements Waehrung{
    private double wert;
//    constructor
    public Euro (double wert){
        this.wert = wert;
    }

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
