public class KaffeeState extends State{
    public KaffeeState(Kaffeemaschine kaffeemaschine) {
        super(kaffeemaschine);
    }
//    implement functions from 'State'
    @Override
    public void start() {
//        re-enter kaffee state
        kaffeemaschine.changeState(new KaffeeState(kaffeemaschine));
        System.out.println("Kaffee, " + "Brühzeit: " + kaffeemaschine.getBruehzeit() + ", Röststufe: " + kaffeemaschine.getRoeststufe());
    }

    @Override
    public void stop() {
//        return to STANDBY
        kaffeemaschine.changeState(new StandbyState(kaffeemaschine));
    }

    @Override
    public void select() {
//        change product to milchkaffee
        kaffeemaschine.changeState(new MilchkaffeeState(kaffeemaschine));
    }

//      entry the state Standby
    @Override
    public void onEntry() {
//        print out 'STANDBY' in console
        System.out.println("KAFFEE");
    }
}
