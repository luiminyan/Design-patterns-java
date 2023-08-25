import java.util.ArrayList;
import java.util.Date;

public class ZeitungsVerlag {
    private ArrayList<IAbonnent> abonnenten = new ArrayList<IAbonnent>();

    // register
    public void registriereBeobachter(IAbonnent abonnent) {
        abonnenten.add(abonnent);
    }

    // unregister
    public void entferneBeobachter(IAbonnent abonnent) {
        abonnenten.remove(abonnent);
    }

    // informAllSubscriber
    public void benachrichtigeBeobachter(Zeitung zeitung) {
        for (IAbonnent abonnent : abonnenten) {
            abonnent.erhalteZeitung(zeitung);
        }
    }

    // (self) update of object
    public void verteileZeitung(String titel) {
        Zeitung zeitung = new Zeitung(new Date(), titel);
        benachrichtigeBeobachter(zeitung);
    }

}
