import java.util.ArrayList;
import java.util.Date;

public class ZeitungsVerlag{
    //attribute
    private String name;
    private ArrayList<Abonnent> abonnentList = new ArrayList<>();

    //constructor
    public ZeitungsVerlag(String name){
        this.name = name;
    }

   //functions
    public void registiereAbonnent(Abonnent abonnent){
        abonnentList.add(abonnent);
    }

    public void entferneAbonnet(Abonnent abonnent){
        if (!abonnentList.contains(abonnent)){
            abonnentList.remove(abonnent);
        }
        else System.out.println("Abonnent ist schon registiert!");
    }

    //notify all observers
    public void benachrichtigeAlleBeobachter(Zeitung zeitung){
        for (Abonnent a: abonnentList) {
            a.erhalteZeitung(zeitung);
        }
    }

    //more or less the same as above
    public void verteileZeitung(String titel){
        Zeitung zeitung = new Zeitung(new Date(), titel);
        benachrichtigeAlleBeobachter(zeitung);
    }
}
