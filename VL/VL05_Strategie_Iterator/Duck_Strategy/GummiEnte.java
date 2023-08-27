package Duck_Strategy;

public class GummiEnte extends Ente {
    // constructor : call super with concrete strategies
    public GummiEnte() {
        super(new Quietschen(), new FliegtGarNicht());
    }

    @Override
    public void anzeige() {
        System.out.println("Sieht aus wie eine Gummiente.");
        super.anzeige();
        System.out.println("--------------------------");
    } 
}
