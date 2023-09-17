import java.util.Date;

public class Zeitung {
    private String titel;
    private Date datum;
    public Zeitung(String titel, Date datum){
        this.titel = titel;
        this.datum = datum;
    }
    public String getTitel(){
        return titel;
    }
    public Date getDatum(){
        return datum;
    }
}
