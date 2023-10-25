public class ActionOpen implements ActionListenerCommands{
    //attribute
    private Document document;

    //constructor
    public ActionOpen(Document d){
        this.document = d;
    }

    //implement the function from interface ActionListenerCommand
    @Override
    public void execute() {
        document.open();
    }
}
