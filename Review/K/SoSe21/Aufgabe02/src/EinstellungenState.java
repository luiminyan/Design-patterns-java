public class EinstellungenState extends State{
    public EinstellungenState(Kaffeemaschine kaffeemaschine) {
        super(kaffeemaschine);
    }
//    implement functions from 'State'
    @Override
    public void start() {
        kaffeemaschine.changeState(new BruehzeitState(kaffeemaschine));
    }

    @Override
    public void stop() {
//      change to "STANDBY"
        kaffeemaschine.changeState(new StandbyState(kaffeemaschine));
    }

    @Override
    public void select() {
//      change to "KAFFEE"
        kaffeemaschine.changeState(new KaffeeState(kaffeemaschine));
    }

//      entry the state Standby
    @Override
    public void onEntry() {
//        print out 'STANDBY' in console
        System.out.println("EINSTELLUNGEN");
    }
}
