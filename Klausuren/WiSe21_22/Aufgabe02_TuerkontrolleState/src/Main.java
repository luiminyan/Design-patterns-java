// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        test state pattern
        Maschine maschine = new Maschine();     //open
        maschine.button01();        //closed
        maschine.button02();        //open
        maschine.button02();        //locked
        maschine.button02();        //closed
        maschine.button01();        //locked
        maschine.button01();        //open


    }
}