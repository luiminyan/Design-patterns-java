import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Test
        Ort Bochum = new Ort("Bochum", 12, 15);
        Ort Wattenscheid = new Ort ("Wattenscheid", 25, 18);
        Ort Essen = new Ort("Essen", 30, 20);
        Ort Muelheim = new Ort("Mülheim", 35, 25);

//        create array with fixed length
        Ort[] Route01 = new Ort[4];
        Route01[0] = Bochum;
        Route01[1] = Wattenscheid;
        Route01[2] = Essen;
        Route01[3] = Muelheim;

//        create new auto-startegy
        AutoStrategie autoStrategie = new AutoStrategie();

//        Baustelle Test
        autoStrategie.addBaustelle(Bochum);
        autoStrategie.addBaustelle(Essen);

//        create bike-strtegy
        FahrradStrategie fahrradStrategie = new FahrradStrategie();

//  create NavApp
        NavApp navApp01 =  new NavApp(autoStrategie);
        NavApp navApp02 =  new NavApp(fahrradStrategie);

        System.out.println("\nMit Auto: " + navApp01.berechneZeit(Route01) + " min.");
        System.out.println("Mit Farrad: " + navApp02.berechneZeit(Route01) + " min.");
    }
}