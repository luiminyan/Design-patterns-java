public class FroehlichState implements State{
    //attributes
    private HundMaschine hund;

    //function implementations

    @Override
    public void fuettern(HundMaschine maschine) {
        maschine.setState(new SchlechtState());
        step(maschine);
    }

    @Override
    public void spielen(HundMaschine maschine) {
        hungerCheck(maschine);
        energieCheck(maschine);
        step(maschine);
    }

    @Override
    public void nix_tun(HundMaschine maschine) {
        hungerCheck(maschine);
        energieCheck(maschine);
        step(maschine);
    }

    @Override
    public void tranieren(HundMaschine maschine) {
        maschine.setTraining(maschine.isTraining() + 1);
        maschine.setState(new SchlechtState());
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
        System.out.println("Haustier ist jetzt fröhlich!");
    }

    @Override
    public void exit(HundMaschine maschine) {
        System.out.println("Haustier ist nicht mehr fröhlich!");
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
