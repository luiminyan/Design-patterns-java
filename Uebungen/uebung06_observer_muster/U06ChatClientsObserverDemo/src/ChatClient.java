import java.util.ArrayList;
import java.util.Date;

public class ChatClient {
    //attribute
    private ArrayList<ChatBeobachter> beobachterList = new ArrayList<ChatBeobachter>();

    //constructor
    public ChatClient(){}

    //functions
    public void registriereBeobachter(ChatBeobachter beobachter){
        if (beobachterList.contains(beobachter)){
            System.out.println("Duplicate!");
        }
        else beobachterList.add(beobachter);
    }

    public void entferneBeobachter(ChatBeobachter beobachter){
        beobachterList.remove(beobachter);
    }

    public void benachrichtigeBeobachter(Nachricht n){
        for (ChatBeobachter chatBeobachter:beobachterList) {
            chatBeobachter.aktualisieren(n);
        }
    }

    public void schreibeNachricht(String text, String sender, String empfaenger){
        Nachricht nachricht = new Nachricht(text, sender, empfaenger);
        benachrichtigeBeobachter(nachricht);
    }
}
