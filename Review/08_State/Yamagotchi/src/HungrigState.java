public class HungrigState extends YamaState{
//    constructor
    public HungrigState(Haustier haustier){
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
        System.out.println(haustier.getName() + " ist hungrig!");
//        entry Froehlich State
        haustier.setHunger(haustier.getHunger() + 1);
        haustier.setEnergie(haustier.getEnergie() - 1);
    }
}
