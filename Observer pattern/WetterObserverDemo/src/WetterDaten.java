public class WetterDaten {
    //attributes
    private double luftfeuchtigkeit;
    private double temperatur;
    private double luftdruck;

    //constructor
    public WetterDaten(double luftfeuchtigkeit, double temperatur, double luftdruck){
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.temperatur = temperatur;
        this.luftdruck = luftdruck;
    }

    //getters and setters

    public double getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(double luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(double luftdruck) {
        this.luftdruck = luftdruck;
    }
}
