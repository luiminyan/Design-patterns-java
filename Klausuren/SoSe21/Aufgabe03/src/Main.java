// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bild b1 = new Bild();
        IFilter fRauschen = new RauschenFilter(b1);
        fRauschen = new FilterThreeTimes(fRauschen);
        fRauschen.anwenden();

        IFilter fWeichzeichnen = new WeichzeichnenFilter(b1);
        fWeichzeichnen = new FilterFiveTimes(fWeichzeichnen);
        fWeichzeichnen.anwenden();

    }
}