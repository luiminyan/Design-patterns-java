public abstract class YamaState {
//    protected attribute of machine
    protected Haustier haustier;

//    constructor
    public YamaState(Haustier haustier) {
        this.haustier = haustier;
    }

//    functions of states
    public abstract void spielen();
    public abstract void fuettern();
    public abstract void tranieren();
    public abstract void nixTun();

//    entry the state()
    public abstract void onEntry();
}
