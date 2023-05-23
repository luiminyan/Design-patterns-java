public class OctalObserver implements Observer{
    //attributes
    private Subject subject;

    //constructor
    public OctalObserver(Subject subject){
        this.subject = subject;
        //register observer at subject
        subject.registerObserver(this);
    }

    //implement function
    @Override
    public void update() {
        //print out information
        System.out.println("Octal string = " + Integer.toOctalString(subject.getState()));
    }
}
