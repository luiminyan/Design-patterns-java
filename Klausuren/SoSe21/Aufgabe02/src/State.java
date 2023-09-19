public abstract class State {
//    connect the kaffeemaschine
    protected Kaffeemaschine kaffeemaschine;
    public State(Kaffeemaschine kaffeemaschine) {
        this.kaffeemaschine = kaffeemaschine;
    }
//    functions / Knöpfe
    public abstract void start();
    public abstract void stop();
    public abstract void select();
//    entry state function, to be called when state change of machine
    public abstract void onEntry();
}
