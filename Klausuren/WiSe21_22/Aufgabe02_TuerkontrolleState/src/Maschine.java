public class Maschine {
    private State currentState;
    private String btn01Text;
    private String btn02Text;

    public Maschine(){
//        initialize state with "Open"
        currentState = new OpenState(this);
//          enter state
        currentState.onEntry();
    }
//  button functions
    public void button01(){
        currentState.button01();
    }
    public void button02(){
        currentState.button02();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

//    changeState()
    public void changeState(State newState) {
        currentState = newState;
        newState.onEntry();
    }

    public String getBtn01Text() {
        return btn01Text;
    }

    public void setBtn01Text(String btn01Text) {
        this.btn01Text = btn01Text;
    }

    public String getBtn02Text() {
        return btn02Text;
    }

    public void setBtn02Text(String btn02Text) {
        this.btn02Text = btn02Text;
    }
}
