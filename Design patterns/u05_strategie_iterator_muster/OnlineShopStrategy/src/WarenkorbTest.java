public class WarenkorbTest {
    public static void main(String[] args){
        Zahlungsstrategie zahlungsstrategie01 = new PayPalStrategie("luiminyan@gmail.com", "halloWorld89");
        Warenkorb warenkorb01 = new Warenkorb(zahlungsstrategie01);

        Zahlungsstrategie zahlungsstrategie02 = new KreditkartenStrategie("Pupi L", "DE3281783712", "78943", "2020-02-15");
        Warenkorb warenkorb02 = new Warenkorb(zahlungsstrategie02);

        warenkorb01.zahle(10000);
        warenkorb02.zahle(60);
    }
}
