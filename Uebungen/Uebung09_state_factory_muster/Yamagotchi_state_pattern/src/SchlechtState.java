public class SchlechtState implements State{
    //attributes
    private HundMaschine hundMachine;

    //function implementation
    @Override
    public void fuettern(HundMaschine maschine) {
        energieCheck(maschine);
        hungerCheck(maschine);
        step(maschine);
    }

    @Override
    public void spielen(HundMaschine maschine) {
        maschine.setState(new FroehlichState());
        step(maschine);
    }

    @Override
    public void nix_tun(HundMaschine maschine) {
        energieCheck(maschine);
        hungerCheck(maschine);
        step(maschine);
    }

    @Override
    public void tranieren(HundMaschine maschine) {
        System.out.println("Haustier ist schlecht gelaunt, mag nicht tranieren!");
        energieCheck(maschine);
        hungerCheck(maschine);
        step(maschine);
    }

    @Override
    public void step(HundMaschine maschine) {
        maschine.setHunger(maschine.getHunger() + 1);
        maschine.setEnergie(maschine.getEnergie() - 2);
    }

    @Override
    public void entry(HundMaschine maschine) {
        System.out.println("Haustier ist jetzt schlecht gelaunt!");
    }

    @Override
    public void exit(HundMaschine maschine) {
        System.out.println("Haustier ist nicht mehr schlecht gelaunt!");
    }

    private void hungerCheck(HundMaschine maschine){
        if (maschine.getHunger() >= 10){
            maschine.setState(new HungrigState());
        }
    }

    private void energieCheck(HundMaschine maschine){
        if (maschine.getEnergie() <= 0){
            maschine.setState(new SchlafendState());
        }
    }
}
