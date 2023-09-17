import java.io.File;

public class Main {
    public static void main(String[] args) {
        Document document = new Document(new File(""));
        ActionListenerCommand actionOpen = new ActionOpen(document);
        ActionListenerCommand actionClose = new ActionClose(document);
        Menuoptionen menuoptionen = new Menuoptionen(actionOpen, actionClose);
    }
}