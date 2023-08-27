package Duck_Strategy;

public class StummesQuaken implements QuakVerhalten{

    @Override
    public void quaken() {
        System.out.println("Die Ente kann nicht quaken!");
    }
    
}
