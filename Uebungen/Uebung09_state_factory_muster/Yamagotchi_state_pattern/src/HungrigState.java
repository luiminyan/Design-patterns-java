import java.io.Console;

public class HungrigState implements State{
    //attributes
    private HundMaschine hundMaschine;

    //func implementation
    @Override
    public void fuettern(HundMaschine maschine) {
        maschine.setState(new FroehlichState());
        step(maschine);
        maschine.setHunger(0);
    }

    @Override
    public void spielen(HundMaschine maschine) {
        System.out.println("Haustier ist noch hungrig, mag nicht spielen!");
        step(maschine);
    }

    @Override
    public void nix_tun(HundMaschine maschine) {
        step(maschine);
    }

    @Override
    public void tranieren(HundMaschine maschine) {
        System.out.println("Haustier ist noch hungrig, mag nicht tranieren!");
        step(maschine);
    }

    @Override
    public void step(HundMaschine maschine) {
        //energie - 1
        maschine.setEnergie(maschine.getEnergie() - 1);
        //hunger + 1
        maschine.setHunger(maschine.getHunger() + 1);
    }

    @Override
    public void entry(HundMaschine maschine) {
        System.out.println("Haustier ist jetzt hungrig!");
    }

    @Override
    public void exit(HundMaschine maschine) {
        System.out.println("Haustier ist nicht mehr hungrig!");
    }
}
