public class PayPalStrategie implements Zahlungsstrategie{
    //attributes
    private String email;
    private String password;

    //constructor
    public PayPalStrategie(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void zahle(int preis){
        //print:  Email , password
        System.out.println("Email: " + email + "\tPreis: " + preis);
    }
}
