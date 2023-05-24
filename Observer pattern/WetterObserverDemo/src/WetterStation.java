public class WetterStation extends WetterDatenAnbieter{
    //attributes
    private String id;
    private double luftfeuchtigkeit;
    private double temperatur;
    private double luftdruck;

    //constructor
    public WetterStation(String id){
        this.id = id;
    }

    //functions
    public void messWerteGeandert(){
        benachrichtigeAbonnenten(new WetterDaten(getLuftfeuchtigkeit(), getTemperatur(), getLuftdruck()));
    }

    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
