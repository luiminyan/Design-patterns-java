package WetterDaten_Observer;

import java.util.ArrayList;

public class WetterStation extends WetterDatenAnbieter{
    private String id;

    // constructor
    public WetterStation(String id){
        // call parent class constructor
        super();
        this.id = id;
    }

    // new data update
    public void messwerteGeaendert(double luftfeuchtigkeit, double temperatur, double luftdruck) {
        WetterDaten wetterDaten = new WetterDaten(luftfeuchtigkeit, temperatur, luftdruck);
        benachrichtigeAbonnenten(wetterDaten);
    }

    // getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
