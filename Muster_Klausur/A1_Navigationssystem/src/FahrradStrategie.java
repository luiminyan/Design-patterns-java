import java.util.ArrayList;

public class FahrradStrategie implements ReiseStrategie{
//    attribute
    private final double GESCHWINDIGKEIT = 10.0;

//    constructor : not necessary, as default constructor
    public FahrradStrategie(){}

//    implement capsuled function from interface
    @Override
    public double berechneZeit(Ort[] route) {
        double sum = 0.0;
//        iterate over the route list
        for (Ort outItem : route) {
            double distance = Math.sqrt(Math.pow(outItem.getX(), 2) + Math.pow(outItem.getY(), 2));
            sum += distance;
        }
        return (sum / GESCHWINDIGKEIT) * 60;
    }
}
