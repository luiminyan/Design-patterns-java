public class ActionClose implements ActionListenerCommand{
    private Document document;
    public ActionClose(Document document){
        this.document = document;
    }
    @Override
    public void execute(){
        document.Close();
    }
}
