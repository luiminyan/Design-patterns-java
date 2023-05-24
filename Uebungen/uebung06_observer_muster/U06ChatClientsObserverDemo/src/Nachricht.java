import java.util.Date;

public class Nachricht {
    //attributes
    private Date uhrzeit;
    private String text;
    private String empfaenger;
    private String sender;

    //constructor
    public Nachricht(String text, String empfaenger, String sender) {
        this.uhrzeit = new Date();
        this.text = text;
        this.empfaenger = empfaenger;
        this.sender = sender;
    }

    public Date getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(Date uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(String empfaenger) {
        this.empfaenger = empfaenger;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
