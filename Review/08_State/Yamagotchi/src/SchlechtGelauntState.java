public class SchlechtGelauntState extends YamaState{
//    constructor
    public SchlechtGelauntState(Haustier haustier){
        super(haustier);
    }
    
//    content: YamaMachine
    @Override
    public void spielen() {


    }

    @Override
    public void fuettern() {

    }

    @Override
    public void tranieren() {

    }

    @Override
    public void nixTun() {

    }

    @Override
    public void onEntry() {
//        printing
        System.out.println(haustier.getName() + " ist schlecht gelaunt!");
//        entry Froehlich State
        haustier.setHunger(haustier.getHunger() + 1);
        haustier.setEnergie(haustier.getEnergie() - 2);
    }
}
