public class OpenState extends State{
    public OpenState(Maschine maschine) {
        super(maschine);
    }

//      implements button functions
    @Override
    public void button01() {
        maschine.changeState(new ClosedState(maschine));
    }

    @Override
    public void button02() {
        maschine.changeState(new LockedState(maschine));
    }

    @Override
    public void onEntry() {
        maschine.setBtn01Text("Close");
        maschine.setBtn02Text("Close and Lock");
        System.out.println("Open");
        System.out.println("Button 1:" + maschine.getBtn01Text());
        System.out.println("Button 2:" + maschine.getBtn02Text());
    }
}
