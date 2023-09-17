public class Main {
    public static void main(String[] args) {
        Warenkorb warenkorb01 = new Warenkorb(new KreditkartenStartegie("Milan", "DE454674839", "XXX", "2012-12-22"));
        warenkorb01.zahle(10);

        Warenkorb warenkorb02 = new Warenkorb(new PayPalStartegie("milan@gmx.de", "Mimipulan"));
        warenkorb02.zahle(120);

    }
}