public class HundMaschine {
    //attributes
    //attributes
    private int Energie = 5;
    private int Hunger = 0;
    private int Training = 0;

    private State state;    //record the state

    //constructor
    public HundMaschine(){
        this.state = new FroehlichState();
        System.out.println("Haustier ist initialisiert und froehlich!");
    }

    //getters
    public int getEnergie() {
        return Energie;
    }

    public int getHunger() {
        return Hunger;
    }

    public int isTraining() {
        return Training;
    }

    public State getState() {
        return state;
    }

    //and setters
    public void setEnergie(int energie) {
        Energie = energie;
    }

    public void setHunger(int hunger) {
        Hunger = hunger;
    }

    public void setTraining(int training) {
        Training = training;
    }

    public void setState(State newState) {
        if (newState == state){
            state = newState;
            return;
        }
        else {
            state.exit(this);  //exit old state
            state = newState;
            state.entry(this);  //enter new state
        }
    }

    public void spielen(){
        getState().spielen(this);
    }
    public void fuettern(){
        getState().fuettern(this);
    }
    public void tranieren(){
        getState().tranieren(this);
    }
    public void nix_tun(){
        getState().nix_tun(this);
    }

    public void step(){
        getState().step(this);
    }
}
