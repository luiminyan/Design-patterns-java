import java.util.Base64;

public class EmailImpl implements IEmail{
    private String subject;
    private String content;

//    constructor
    public EmailImpl(String subject, String content){
        this.subject = subject;
        this.content = content;
    }

    public boolean isEncrypted(){
        return content.matches("[A-Za-z0-9+/]+={0,2}");
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getContent() {
        return content;
    }
}
