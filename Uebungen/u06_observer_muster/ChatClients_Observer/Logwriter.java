package ChatClients_Observer;

import java.io.FileWriter;
import java.io.IOException;

// the concrete observer / Abonnent
public class Logwriter implements IChatBeobachter{

    @Override
    public void aktualisieren(Nachricht nachricht) {
        String dateiName = nachricht.getEmpfaenger() + ".txt";
        try {
            FileWriter fw = new FileWriter(dateiName, true);
            fw.append("[" + nachricht.getUhrzeit() + "] " + nachricht.getSender() + ":" + nachricht.getText()+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Datei " + dateiName + " konnte nicht geöffnetwerden");
            e.printStackTrace();
        }
    }
}
