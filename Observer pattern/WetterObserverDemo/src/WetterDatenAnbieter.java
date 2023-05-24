import java.util.ArrayList;

public class WetterDatenAnbieter {
    //attributes
    private ArrayList<WetterDatenAbonennt> beobeachterList = new ArrayList<>();

    //constructor

    //functions
    //register beobachter
    public void registriereBeobachter(WetterDatenAbonennt beobachter){
        //arrayList cannot contain duplicates
        if (!beobeachterList.contains(beobachter)){
            beobeachterList.add(beobachter);
        }
        else System.out.println("Cannot add duplicate element into the observer list.");
    }

    //delete beobachter
    public void enterneBeobachter(WetterDatenAbonennt beobachter){
        beobeachterList.remove(beobachter);
    }

    //notify all observers
    public void benachrichtigeAbonnenten(WetterDaten wetterDaten){
        //arrayList cannot contain duplicates
        for (WetterDatenAbonennt beobachter: beobeachterList) {
            beobachter.aktuliesiren(wetterDaten);
        }
    }
}
