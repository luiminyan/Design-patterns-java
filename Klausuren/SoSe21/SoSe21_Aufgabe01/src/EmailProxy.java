import java.util.Base64;
public class EmailProxy implements IEmail{
    private EmailImpl email;

    public EmailProxy(String subject, String content){
        email = new EmailImpl(subject, content);
    }

    @Override
    public String getSubject() {
        return email.getSubject();
    }

    @Override
    public String getContent() {
        if (email.isEncrypted()) {
            String contentString = email.getContent();
            byte[] decodedBytes = Base64.getDecoder().decode(contentString);
            return new String(decodedBytes);
        }
        else return email.getContent();
    }
}
