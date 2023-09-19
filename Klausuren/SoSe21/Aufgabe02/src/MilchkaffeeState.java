public class MilchkaffeeState extends State{
    public MilchkaffeeState(Kaffeemaschine kaffeemaschine) {
        super(kaffeemaschine);
    }
//    implement functions from 'State'
    @Override
    public void start() {
//        re-enter "Milchkaffee" mode
        kaffeemaschine.changeState(new MilchkaffeeState(kaffeemaschine));
        System.out.println("Milchkaffee, " + "Brühzeit: " + kaffeemaschine.getBruehzeit() + ", Röststufe: " + kaffeemaschine.getRoeststufe());
    }

    @Override
    public void stop() {
//        return to "STANDBY"
        kaffeemaschine.changeState(new StandbyState(kaffeemaschine));
    }

    @Override
    public void select() {
//        change to "EINSTELLUNGEN"
        kaffeemaschine.changeState(new EinstellungenState(kaffeemaschine));

    }

//      entry the state Standby
    @Override
    public void onEntry() {
//        print out 'STANDBY' in console
        System.out.println("MILCHKAFFEE");
    }
}
