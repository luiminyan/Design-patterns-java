public class FroehlichState extends YamaState{
//    constructor
    public FroehlichState(Haustier haustier){
        super(haustier);
    }

//    content: YamaMachine
    @Override
    public void spielen() {
        if (haustier.getHunger() > 10) {
            haustier.changeState(new HungrigState(haustier));
        }
        else {
            if (haustier.getEnergie() <= 0) {
                haustier.changeState(new SchlafendState(haustier));
            }
            else {
                haustier.changeState(new FroehlichState(haustier));
            }
        }
    }

    @Override
    public void fuettern() {
        haustier.changeState(new SchlechtGelauntState(haustier));
    }

    @Override
    public void tranieren() {
        haustier.setTraining(haustier.getTraining() + 1);
//        change the currentState of the haustier into new State (SchlechtGelauntState)
        haustier.changeState(new SchlechtGelauntState(haustier));
    }

    @Override
    public void nixTun() {
        if (haustier.getHunger() > 10) {
            haustier.changeState(new HungrigState(haustier));
        }
        else {
            if (haustier.getEnergie() <= 0) {
                haustier.changeState(new SchlafendState(haustier));
            }
            else {
                haustier.changeState(new FroehlichState(haustier));
            }
        }
    }

    @Override
    public void onEntry() {
//        printing
        System.out.println(haustier.getName() + " ist froehlich!");
//        entry Froehlich State
        haustier.setHunger(haustier.getHunger() + 1);
        haustier.setEnergie(haustier.getEnergie() - 1);
    }
}
