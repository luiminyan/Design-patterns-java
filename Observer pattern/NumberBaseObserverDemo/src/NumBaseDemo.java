public class NumBaseDemo {
    public static void main(String[] args){
        //create new subject
        Subject subject01 = new Subject();

        //create observers and register with subject
        Observer observerBinary01 = new BinaryObserver(subject01);
        Observer observerOctal01 = new OctalObserver(subject01);
        Observer observerHexa01 = new HexaObserver(subject01);

        //set state of the subject
        subject01.setState(8);
        subject01.notifyAllObservers();     //called from subject side, to notify all observers

        //create new observers and register with subject
        Observer observerBinary02 = new BinaryObserver(subject01);
        Observer observerOctal02 = new OctalObserver(subject01);
        Observer observerHexa02 = new HexaObserver(subject01);

        //update observers by calling update
        observerBinary02.update();
        observerOctal02.update();
        observerHexa02.update();

    }
}
