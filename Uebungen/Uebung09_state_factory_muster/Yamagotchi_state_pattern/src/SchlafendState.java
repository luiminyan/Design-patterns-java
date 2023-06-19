public class SchlafendState implements State{
    //attributes
    private HundMaschine hundMachine;

    //func
    @Override
    public void fuettern(HundMaschine maschine) {
        maschine.setState(new FroehlichState());
        step(maschine);
        maschine.setHunger(0);
    }

    @Override
    public void spielen(HundMaschine maschine) {
        System.out.println("Haustier ist beim Schlafen, bitte nicht stören.");
        maschine.setState(new SchlechtState());
        step(maschine);
    }

    @Override
    public void nix_tun(HundMaschine maschine) {
        if (maschine.getEnergie() >= 16){
            maschine.setState(new FroehlichState());
        }
        step(maschine);
    }

    @Override
    public void tranieren(HundMaschine maschine) {
        System.out.println("Haustier ist beim Schlafen, bitte nicht stören.");
        maschine.setState(new SchlechtState());
        step(maschine);
    }

    @Override
    public void step(HundMaschine maschine) {
        maschine.setHunger(maschine.getHunger() + 1);
        maschine.setEnergie(maschine.getEnergie() + 4);
    }

    @Override
    public void entry(HundMaschine maschine) {
        System.out.println("Haustier schläft jetzt!");
    }

    @Override
    public void exit(HundMaschine maschine) {
        System.out.println("Haustier schläft nicht mehr!");
    }
}
