import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Test
        Ort Bochum = new Ort("Bochum", 12, 15);
        Ort Wattenscheid = new Ort ("Wattenscheid", 25, 18);
        Ort Essen = new Ort("Essen", 30, 20);
        Ort Muelheim = new Ort("Mülheim", 35, 25);

//        route
        ArrayList<Ort> Route = new ArrayList<>();
        Route.add(Bochum);
        Route.add(Wattenscheid);
        Route.add(Essen);
        Route.add(Muelheim);

//        create new auto-startegy
        AutoStrategie autoStrategie = new AutoStrategie();
//        Baustelle Test
        autoStrategie.addBaustelle(Bochum);
        autoStrategie.addBaustelle(Essen);


//        create bike-strtegy
        FahrradStrategie fahrradStrategie = new FahrradStrategie();

//  create NavApp
        NavApp navApp01 =  new NavApp(autoStrategie, Route);
        NavApp navApp02 =  new NavApp(fahrradStrategie, Route);

        System.out.println("\nMit Auto: " + navApp01.berechneZeit() + " min.");
        System.out.println("Mit Farrad: " + navApp02.berechneZeit() + " min.");
    }
}