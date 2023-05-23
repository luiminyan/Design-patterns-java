public class BinaryObserver implements Observer{
    //attributes
    private Subject subject;

    //constructor
    public BinaryObserver(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    //implement function
    @Override
    public void update() {
        //print out information
        System.out.println("Binary string = " + Integer.toBinaryString(subject.getState()));
    }

}
