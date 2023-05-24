import java.util.ArrayList;
import java.util.HashMap;

public class WetterAnzeige implements WetterDatenAbonennt{
    private HashMap<WetterDatenAnbieter, ArrayList<WetterDaten>> datenAnbieter;
    private String anzeigeID;

    //constructor: connect to subject
    public WetterAnzeige(String anzeigeID){
        this.anzeigeID = anzeigeID;
    }

    @Override
    public void aktuliesiren(WetterDaten wetterDaten) {
        System.out.println("Wetteranzeige der Wetterstation mit ID: " + getId());
        System.out.println("Luftfeuchtigkeit: " + wetterDaten.getLuftfeuchtigkeit());
        System.out.println("Temperatur: " + wetterDaten.getTemperatur());
        System.out.println("Luftdruck: " + wetterDaten.getLuftdruck() + "\n");
    }

    public String getId() {
        return anzeigeID;
    }

    public void setAnzeigeID(String anzeigeID) {
        this.anzeigeID = anzeigeID;
    }
}
