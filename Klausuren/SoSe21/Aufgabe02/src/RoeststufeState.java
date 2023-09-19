public class RoeststufeState extends State{
    public RoeststufeState(Kaffeemaschine kaffeemaschine) {
        super(kaffeemaschine);
    }
//    implement functions from 'State'
    @Override
    public void start() {
//        ！！！！先做machine的attr的变化，然后再更改state， 非常重要！！！！
        kaffeemaschine.setRoeststufe();
//      re-enter Röststufe and set Röststufe
        kaffeemaschine.changeState(new RoeststufeState(kaffeemaschine));
    }

    @Override
    public void stop() {
//      back to Einstellungen
        kaffeemaschine.changeState(new EinstellungenState(kaffeemaschine));
    }

    @Override
    public void select() {
//        change to Roeststufe
        kaffeemaschine.changeState(new BruehzeitState(kaffeemaschine));
    }

//      entry the state Standby
    @Override
    public void onEntry() {
//        print out "RÖSTSTUFE" in console
        System.out.println("RÖSTSTUFE " + kaffeemaschine.getRoeststufe());
    }
}
