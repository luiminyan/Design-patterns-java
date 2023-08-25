package WetterDaten_Observer;
public class WetterDaten {
    private double luftfeuchtigkeit;
    private double temperatur;
    private double luftdruck;
    
    // constructor
    public WetterDaten(double luftfeuchtigkeit, double temperatur, double luftdruck) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.temperatur = temperatur;
        this.luftdruck = luftdruck;
    }

    // getters
    public double getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public double getLuftdruck() {
        return luftdruck;
    }
}
