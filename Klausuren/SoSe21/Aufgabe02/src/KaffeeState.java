public class StandbyState extends State{
    public StandbyState(Kaffeemaschine kaffeemaschine) {
        super(kaffeemaschine);
    }
//    implement functions from 'State'
    @Override
    public void start() {
        kaffeemaschine.changeState(new );
    }

    @Override
    public void stop() {
//        invalid button on this state
    }

    @Override
    public void select() {
//        invalid button on this state
    }

//      entry the state Standby
    @Override
    public void onEntry() {
//        print out 'STANDBY' in console
        System.out.println("STANDBY");
    }
}
