package ChatClients_Observer;
// Anzeiger

import java.util.ArrayList;

public class ChatClient {
    // list of subscribers
    ArrayList<IChatBeobachter> chatBeobachters = new ArrayList<IChatBeobachter>();

    // constructors
    public ChatClient() {}

    // getters and setters
    public ArrayList<IChatBeobachter> getChatBeobachters() {
        return chatBeobachters;
    }

    public void setChatBeobachters(ArrayList<IChatBeobachter> chatBeobachters) {
        this.chatBeobachters = chatBeobachters;
    }

    // functions by observer pattern <行为型模式>
    // register 
    public void registriereBeobachter (IChatBeobachter chatBeobachter) {
        chatBeobachters.add(chatBeobachter);
    }

    // unregister
    public void entferneBeobachter (IChatBeobachter chatBeobachter) {
        chatBeobachters.remove(chatBeobachter);
    }

    // inform all subscribers
    public void benachrichtigeBeobachter (Nachricht nachricht) {
        for (IChatBeobachter chatBeobachter : chatBeobachters) {
            chatBeobachter.aktualisieren(nachricht);
        }
    }

    // new message by Anzeiger / update itself
    public void schreibeNachricht(String text, String empfaenger, String sender) {
        Nachricht nachricht = new Nachricht(text, empfaenger, sender);
        benachrichtigeBeobachter(nachricht);
    }

}
