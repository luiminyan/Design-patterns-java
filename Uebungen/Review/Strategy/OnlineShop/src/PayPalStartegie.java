public class PayPalStartegie implements Zahlungstrategie{
    private String email;
    private String password;
    public PayPalStartegie(String email, String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public void zahle(int preis){
        System.out.println("User " + email + " paid " + preis + " euro.");
    }
}
