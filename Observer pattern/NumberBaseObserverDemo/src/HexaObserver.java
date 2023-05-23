public class HexaObserver implements Observer{
    //attributes
    private Subject subject;

    //constructor
    public HexaObserver(Subject subject){
        this.subject = subject;
        //register observer at subject
        subject.registerObserver(this);
    }

    //implement function
    @Override
    public void update() {
        //print out information
        System.out.println("Hexadecimal string = " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
