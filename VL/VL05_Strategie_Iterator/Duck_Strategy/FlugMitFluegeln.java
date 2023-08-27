package Duck_Strategy;

public class FlugMitFluegeln implements FlugVerhalten{

    @Override
    public void fliegen() {
        System.out.println("Die Ente fliegt mit Fluegeln!"); 
    }
}
