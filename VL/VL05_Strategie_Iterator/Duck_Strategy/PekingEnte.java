package Duck_Strategy;

public class PekingEnte extends Ente{
    public PekingEnte () {
        super(new StummesQuaken(), new FliegtGarNicht());
    }

    public void anzeige() {
        System.out.println("Die Ente sieht lecker aus.");
        super.anzeige();
        System.out.println("--------------------------");
    }
}
