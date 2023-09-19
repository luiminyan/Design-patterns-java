public class Kaffeemaschine {
//    currentState
    private State currentState;
    private String[] straekeList = {"HOCH", "MITTEL",  "NIEDRIG"};
    private int bruehCounter = 0;
    private int roestCounter = 0;
    private String bruehzeit = straekeList[0];
    private String roeststufe = straekeList[0];

    public Kaffeemaschine() {
//        create concrete starting state and entry the starting state
        currentState = new StandbyState(this);
//        entry the current state
        currentState.onEntry();
    }

//    state functions / buttons
    public void start(){
//        call currentState.start()
        currentState.start();
    }

    public void stop(){
        currentState.stop();
    }

    public void select(){
        currentState.select();
    }

    public State getCurrentState(){
        return currentState;
    }

    public void changeState(State newState) {
        if (newState != null) {
//           if onExit(), call currentState().onExit()
            currentState = newState;
            newState.onEntry();
        }

    }

//    other getters & setters

    public String getBruehzeit() {
        return bruehzeit;
    }

//      set straekeString by list[int]
    public void setBruehzeit() {
        bruehCounter += 1;
        bruehzeit = straekeList[bruehCounter % 3];
    }

    public String getRoeststufe() {
        return roeststufe;
    }

    public void setRoeststufe() {
        roestCounter += 1;
        roeststufe = straekeList[roestCounter % 3];
    }
}
