package WetterDaten_Observer;

public class WetterDatenTest {
    public static void main(String args[]) {
        WetterStation wetterStation01 = new WetterStation("WS01");
        WetterStation wetterStation02 = new WetterStation("WS02");

        IWetterDatenAbonnent wetterStatistiken01 =  new WetterStatistiken();
        wetterStation01.registriereBeobachter(wetterStatistiken01);
        wetterStation02.registriereBeobachter(wetterStatistiken01);

        wetterStation01.benachrichtigeAbonnenten(new WetterDaten(58, 24, 100));
        wetterStation02.benachrichtigeAbonnenten(new WetterDaten(20, -10, 200));
     
        
    }
}
