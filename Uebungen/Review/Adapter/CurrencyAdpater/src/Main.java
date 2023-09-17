public class Main {
    public static void main(String[] args) {
//        only create Adpater, use adaptee as parameter in adpter
        WaehrungenAdapter waehrungenAdapter01 = new WaehrungenAdapter(new CADollar(10));
        System.out.println(waehrungenAdapter01.getWertInEUR());

        WaehrungenAdapter waehrungenAdapter02 = new WaehrungenAdapter(new USDollar(10));
        System.out.println(waehrungenAdapter02.getWertInEUR());
    }
}