public class ActionClose implements ActionListenerCommands{
    //attribute
    private Document document;

    //constructor
    public ActionClose(Document d){
        this.document = d;
    }

    //implement the function from interface ActionListenerCommand
    @Override
    public void execute() {
        //do the actual execution
        document.close();
    }
}
