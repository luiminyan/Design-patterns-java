public class Main {
    public static void main(String[] args) {
        ZeitungsVerlag zeitungsVerlag = new ZeitungsVerlag();
        IAbonnet abo01 = new Abonnent("Milan");
        IAbonnet abo02 = new Abonnent("Pupi");
        zeitungsVerlag.addAbo(abo01);
        zeitungsVerlag.addAbo(abo02);
        zeitungsVerlag.verteileZeitung("News01");
        zeitungsVerlag.deleteAbo(abo02);
        zeitungsVerlag.verteileZeitung("News02");

    }
}