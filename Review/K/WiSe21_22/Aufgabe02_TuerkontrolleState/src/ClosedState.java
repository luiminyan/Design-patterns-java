public class ClosedState extends State{
    public ClosedState(Maschine maschine) {
        super(maschine);
    }

//      implements button functions
    @Override
    public void button01() {
        maschine.changeState(new LockedState(maschine));
    }

    @Override
    public void button02() {
        maschine.changeState(new OpenState(maschine));
    }

    @Override
    public void onEntry() {
        maschine.setBtn01Text("Lock");
        maschine.setBtn02Text("Open");
        System.out.println("Closed");
        System.out.println("Button 1:" + maschine.getBtn01Text());
        System.out.println("Button 2:" + maschine.getBtn02Text());
    }
}
