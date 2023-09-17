public class FarradStrategy implements ReiseStrategy{
    private double GESCHWINDIGKEIT = 10.0;
    @Override
    public double berechneZeit(Ort[] route){
        double result = 0;
        for (Ort ort : route){
            double distance = Math.sqrt(Math.pow(ort.getX(), 2) + Math.pow(ort.getY(), 2));
            result += distance;
        }
        result = (result / GESCHWINDIGKEIT) * 60;
        return result;
    }
}
