public class WarenkorbTest {
    public static void main(String[] args){

        Zahlungsstrategie payByCreditCard = new KreditkartenStrategie("Milan","DE4617427197", "3276","29.04.2045");
        Zahlungsstrategie payByPayPal = new PayPalStrategie("pipipupipo@popo.com", "46bfdsyy4bhv");

        //create warenkorbs
        Warenkorb warenkorb01 = new Warenkorb(payByCreditCard);
        Warenkorb warenkorb02 = new Warenkorb(payByPayPal);

        warenkorb01.zahle(50);
        warenkorb02.zahle(100);



    }
}
