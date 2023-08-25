import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ZeitungsVerlag verlag01 = new ZeitungsVerlag();
        IAbonnent abonnent01 = new Abonnent("Lehrstuhl Bauwesen");
        IAbonnent max =  new Abonnent("Max Mustermann");

        // register Abonnents in the Anbieter (Verlag)
        verlag01.registriereBeobachter(abonnent01);
        verlag01.registriereBeobachter(max);

        verlag01.verteileZeitung("RUB Zeitung 01");
    }
}
