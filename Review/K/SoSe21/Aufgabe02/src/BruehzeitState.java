public class BruehzeitState extends State{
    public BruehzeitState(Kaffeemaschine kaffeemaschine) {
        super(kaffeemaschine);
    }
//    implement functions from 'State'
    @Override
    public void start() {
//       first set Brühzeit + then re-enter "BRÜHZEIT" state
        kaffeemaschine.setBruehzeit();
        kaffeemaschine.changeState(new BruehzeitState(kaffeemaschine));
    }

    @Override
    public void stop() {
//      enter "EINSTELLUNG
        kaffeemaschine.changeState(new EinstellungenState(kaffeemaschine));
    }

    @Override
    public void select() {
//      enter "RÖSTSTUFE"
        kaffeemaschine.changeState(new RoeststufeState(kaffeemaschine));
    }

//      entry the state Standby
    @Override
    public void onEntry() {
//        print out 'STANDBY' in console
        System.out.println("BRÜHZEIT " + kaffeemaschine.getBruehzeit());
    }
}
