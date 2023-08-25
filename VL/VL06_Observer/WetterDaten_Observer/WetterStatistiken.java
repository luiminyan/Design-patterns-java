package WetterDaten_Observer;

public class WetterStatistiken implements IWetterDatenAbonnent{

    @Override
    public void aktualisieren(WetterDaten wetterDaten) {
        System.out.println("Luftfeuchtigkeit: " + wetterDaten.getLuftfeuchtigkeit() + ", temperatur: " + wetterDaten.getTemperatur() + ", luftdruck " + wetterDaten.getLuftdruck() + "\n");
    }
}
