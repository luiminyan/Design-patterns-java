public class ChatTest {
    public static void main(String[] args){
        //create chat client / subject
        ChatClient client01 = new ChatClient();

        //create observers
        ChatBeobachter anzeige01 = new Anzeige();

        //create nachricht
        Nachricht nachricht01 = new Nachricht("Apple", "ReceiverApple", "SenderApple");

        //connection
        client01.registriereBeobachter(anzeige01);
        client01.schreibeNachricht("Hello world!", "Minhua", "Milan");
        anzeige01.aktualisieren(nachricht01);

    }
}
