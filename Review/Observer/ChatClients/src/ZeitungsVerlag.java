import java.util.ArrayList;
import java.util.Date;

public class ZeitungsVerlag {
    private ArrayList<IAbonnet> Abonnenten;
    public ZeitungsVerlag(){
        this.Abonnenten = new ArrayList<>();
    }
    public void addAbo(IAbonnet abo){
        Abonnenten.add(abo);
    }

    public void deleteAbo(IAbonnet abo){
        Abonnenten.remove(abo);
    }

    public void notifyAllAbos(Zeitung zeitung){
        for (IAbonnet abo : Abonnenten) {
            abo.akualisieren(zeitung);
        }
    }

    public void verteileZeitung(String titel){
        notifyAllAbos(new Zeitung(titel, new Date()));
    }
}
