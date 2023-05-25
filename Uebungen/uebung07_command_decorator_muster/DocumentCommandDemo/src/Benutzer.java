public class Benutzer {
    public static void main(String[] args){
        //create document
        Document document01 = new Document();

        //create ActionListenerCommands
        ActionListenerCommands actionOpen01 = new ActionOpen(document01);
        ActionListenerCommands actionClose01 = new ActionClose(document01);

        //create MenuOptionen to execute the operations
        MenuOptionen menuOptionen01 = new MenuOptionen(actionClose01, actionClose01);

    }
}
