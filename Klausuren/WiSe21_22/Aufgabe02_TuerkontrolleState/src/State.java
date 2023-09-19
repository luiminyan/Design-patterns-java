public abstract class State {
//    connect the machine
    protected Maschine maschine;
//     constructor
    public State(Maschine maschine) {
        this.maschine = maschine;
    }
//    buttons functions
    public abstract void button01();
    public abstract void button02();
//    onEntry()
    public abstract void onEntry();
}
