package WetterDaten_Observer;

import java.util.ArrayList;

class WetterDatenAnbieter {
    private ArrayList<IWetterDatenAbonnent> beobachter = new ArrayList<IWetterDatenAbonnent>();

    // constructor
    public WetterDatenAnbieter() {}

    // register
    public void registriereBeobachter(IWetterDatenAbonnent abonnent) {
        beobachter.add(abonnent);
    }

    // unregister
    public void entferneBeobachter(IWetterDatenAbonnent abonnent) {
        beobachter.remove(abonnent);
    }

    // notify all abonnents
    public void benachrichtigeAbonnenten(WetterDaten wetterDaten) {
        for (IWetterDatenAbonnent wetterDatenAbonnent : beobachter) {
            wetterDatenAbonnent.aktualisieren(wetterDaten);
        }
    }

    // new data update - implemented in child classes
}
