public class Benutzer {
    public static void main(String[] args){
        //create document
        Document document01 = new Document("foo.txt");

        //create ActionListenerCommands
        ActionListenerCommands actionOpen01 = new ActionOpen(document01);
        ActionListenerCommands actionClose01 = new ActionClose(document01);

        //create MenuOptionen to execute the operations
        MenuOptionen menuOptionen01 = new MenuOptionen(actionOpen01, actionClose01);

        //operate operations through MenuOptionen
        menuOptionen01.clickOpen();
        menuOptionen01.clickClose();

    }
}
