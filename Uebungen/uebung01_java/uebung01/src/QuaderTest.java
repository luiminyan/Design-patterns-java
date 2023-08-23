import java.util.ArrayList;

public class QuaderTest {
    public static void main(String[] args){
        Quader q1 = new Quader(10, 5, 4, 0.5);
        System.out.println("Volumen: " + q1.berechneVolumen() + "m^3");


        Quader q2 = new Quader(5,5,5,0.5);
        System.out.println("Volumen von q2: " + q2.berechneVolumen() + "m^3");

        Quader q3 = new Quader((q1.getB() + q2.getB())/2, (q1.getL() + q2.getL())/2, (q1.getH() + q2.getH())/2, 0.5);
        System.out.println("Volumen von q3: " + q3.berechneVolumen() + "m^3");

        //print
        System.out.println("Die Oberfläche von q1 ist " + q1.berechneOberflaeche());
        System.out.println("Die Oberfläche von q2 ist " + q2.berechneOberflaeche());
        System.out.println("Die Oberfläche von q3 ist " + q3.berechneOberflaeche());

        //print dicht
        System.out.println("Der Gewicht von q1 ist " + q1.berechneGewicht() + "kg");
        System.out.println("Der Gewicht von q2 ist " + q2.berechneGewicht() + "kg");
        System.out.println("Der Gewicht von q3 ist " + q3.berechneGewicht() + "kg");


        //erstellen ArrayList
        ArrayList<Quader> quaderArrayList = new ArrayList<>();
        Quader q4 = new Quader(7,12,6,40);
        Quader q5 = new Quader(10,10,10,8);
        quaderArrayList.add(q1);
        quaderArrayList.add(q2);
        quaderArrayList.add(q3);
        quaderArrayList.add(q4);
        quaderArrayList.add(q5);

        double sum = 0;
        for (int i = 0; i < quaderArrayList.size(); i++){
            double gewicht = quaderArrayList.get(i).berechneGewicht();
            System.out.println("Die Gewicht von q" + (i + 1) + " ist " +gewicht);
            sum += gewicht;
        }
        System.out.println("Die Gesamtgewicht ist " + sum);


        double counter = 0;
        for (int i = 0; i < quaderArrayList.size(); i++){
            if (quaderArrayList.get(i).berechneGewicht() < 5000){
                counter += 1;
            }
            else quaderArrayList.remove(i);
        }
        System.out.println("Die Anzahl der Quadern mit Gewicht weniger 5000 kg ist " + counter);






    }
}
