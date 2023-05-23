import java.util.ArrayList;
import java.util.List;

public class Subject {
    //create the list of observers
    private List<Observer> observers = new ArrayList<>();
    //value of the subject
    private int state;

    //functions
    //register new observer
    public void registerObserver(Observer o){
        if(observers.contains(o)){
            System.out.println("Failed: observer is already registered!");
        }
        else observers.add(o);
    }

    //notify all observers
    public void notifyAllObservers(){
       for (Observer o: observers){
           //call the function update() from all observers
           o.update();
       }
    }

    //getter and setter for state
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
