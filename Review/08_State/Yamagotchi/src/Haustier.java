public class Haustier {
    private String name;
    private int hunger, energie, training;

    //    current state
    private YamaState currentState;

//  constructor
    public Haustier(String name) {
        this.name = name;
//        set the start state as froehlichState
        currentState = new FroehlichState(this);
        currentState.onEntry();
    }

    public YamaState getCurrentState() {
        return currentState;
    }

//    setCurrentState need to be modified
    public void changeState(YamaState newState) {
        if (newState != null) {
//            if onExit() exists, currentState.onExit()
            currentState = newState;
//            use the onEntry function from conc.State to modify the machine / haustier
            newState.onEntry();
        }
    }

//    functions of state changing
    public void tranieren(){
        currentState.tranieren();
    }
    public void fuettern(){
        currentState.fuettern();
    }
    public void spielen() {
        currentState.spielen();
    }
    public void nixTun() {
        currentState.nixTun();
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public int getTraining() {
        return training;
    }

    public void setTraining(int training) {
        this.training = training;
    }

}
