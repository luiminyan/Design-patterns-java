import java.math.*;

public class Hauptklasse {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double radius = 1.0;
        double kreisUmfang = 2 * Math.PI * radius;
        double flaeche = Math.PI * Math.pow(radius, 2);

        System.out.println("Bei einem Radius von " + radius + " beträgt der Umfang " + kreisUmfang + " und die Fläche " + flaeche);

        MeineKlasse meinObjekt1 = new MeineKlasse();
        meinObjekt1.meinText = "foo";

        MeineKlasse meinObjekt2 = new MeineKlasse();
        meinObjekt2.meinText = "bar";

        System.out.println("Obkekt 1: " + meinObjekt1.meinText);
        System.out.println("Obkekt 2: " + meinObjekt2.meinText);

    }
}
