package Duck_Strategy;

public class EnteStrategyTest {
    public static void main(String args[]) {
        Ente gummi = new GummiEnte();
        gummi.anzeige();
       
        Ente pekingEnte01 = new PekingEnte();
        pekingEnte01.anzeige();
    }
}
