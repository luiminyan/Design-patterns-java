package ChatClients_Observer;

public class ChatTest {
    public static void main(String args[]) {
        // Anzeiger
        ChatClient chatClient = new ChatClient();
        // Abonnents / Beobachters
        Logwriter logwriter = new Logwriter();
        Anzeige anzeige = new Anzeige();

        chatClient.registriereBeobachter(anzeige);
        chatClient.registriereBeobachter(logwriter);
        chatClient.schreibeNachricht("I love you!", "Milan Popo M", "Pupi L");
        
    }
}
