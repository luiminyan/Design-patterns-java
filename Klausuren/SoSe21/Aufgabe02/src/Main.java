// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kaffeemaschine kaffeemaschine = new Kaffeemaschine();
//        Start, Select, Select, Start, Start, Select, Stop, Select, Start, Stop
        kaffeemaschine.start();
        kaffeemaschine.select();
        kaffeemaschine.select();
        kaffeemaschine.start();
        kaffeemaschine.start();
        kaffeemaschine.select();
        kaffeemaschine.stop();
        kaffeemaschine.select();
        kaffeemaschine.start();
        kaffeemaschine.stop();
    }
}