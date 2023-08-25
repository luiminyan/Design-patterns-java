package ChatClients_Observer;

public class Anzeige implements IChatBeobachter{

    @Override
    public void aktualisieren(Nachricht nachricht) {
        System.out.println("[" + nachricht.getUhrzeit() + "] Sender: " + nachricht.getSender() + ",Empfänger:" + nachricht.getEmpfaenger() + "-" + nachricht.getText());
    }
}
