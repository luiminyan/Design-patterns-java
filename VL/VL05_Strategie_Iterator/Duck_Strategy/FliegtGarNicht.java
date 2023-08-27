package Duck_Strategy;

public class FliegtGarNicht implements FlugVerhalten{
    @Override
    public void fliegen() {
        System.out.println("Die Ente kann gar nicht fliegen!");
    }
}
