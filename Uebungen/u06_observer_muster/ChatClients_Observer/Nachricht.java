package ChatClients_Observer;

import java.util.Date;

// the item used by Anzeiger
public class Nachricht {
    private Date uhrzeit;
    private String text;
    private String empfaenger;
    private String sender;

    // constructor
    public Nachricht(String text, String empfaenger, String sender) {
        uhrzeit = new Date();
        this.text = text;
        this.empfaenger = empfaenger;
        this.sender = sender;
    }

    // getters
    public Date getUhrzeit() {
        return uhrzeit;
    }

    public String getText() {
        return text;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public String getSender() {
        return sender;
    }
    
}
