public class LockedState extends State{
    public LockedState(Maschine maschine) {
        super(maschine);
    }

//      implements button functions
    @Override
    public void button01() {
        maschine.changeState(new OpenState(maschine));
    }

    @Override
    public void button02() {
        maschine.changeState(new ClosedState(maschine));
    }

    @Override
    public void onEntry() {
        maschine.setBtn01Text("Unlock and Open");
        maschine.setBtn02Text("Unlock");
        System.out.println("Locked");
        System.out.println("Button 1:" + maschine.getBtn01Text());
        System.out.println("Button 2:" + maschine.getBtn02Text());
    }
}
