public class SchlafendState extends YamaState{
//    constructor
    public SchlafendState(Haustier haustier){
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
        System.out.println(haustier.getName() + " ist schlafend!");
//        entry Froehlich State
        haustier.setHunger(haustier.getHunger() + 1);
        haustier.setEnergie(haustier.getEnergie() + 4);
    }
}
