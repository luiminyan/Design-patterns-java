public class Anzeige implements ChatBeobachter{
    @Override
    public void aktualisieren(Nachricht nachricht) {
        //print out information
        System.out.println("[ " + nachricht.getUhrzeit() + " ] Sender: " + nachricht.getSender() + ",Empfänger: " + nachricht.getEmpfaenger() + " - " + nachricht.getText() );
    }
}
