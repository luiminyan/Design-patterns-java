public class Main {
    public static void main(String[] args) {
        Auto auto01 = new FordFiesta();
        Auto auto02 = new OpelAstra();
        auto01 = new KlimaAnlage(auto01);
        auto02 = new LederSitze(auto02);
        auto01.zeigePreis();
        auto02.zeigePreis();


    }
}