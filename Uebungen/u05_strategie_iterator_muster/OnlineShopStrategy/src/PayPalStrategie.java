public class PayPalStrategie implements Zahlungsstrategie{
    private String email;
    private String password;

//    constructor
    public PayPalStrategie(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public void zahle(int preis) {
        System.out.println("Preis: " + preis + ", Email: " + email);
    }
}
