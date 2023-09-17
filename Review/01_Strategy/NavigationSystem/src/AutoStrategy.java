import java.util.ArrayList;

public class AutoStrategy implements ReiseStrategy{
    private double GESCHWENDIGKEIT = 30.5;
    private ArrayList<Ort> baustellen;
    public AutoStrategy(){
        this.baustellen = new ArrayList<>();
    }
    @Override
    public double berechneZeit(Ort[] route){
        double result = 0;
        for (Ort ort : route){
            result += (Math.sqrt(Math.pow(ort.getX(), 2) + Math.pow(ort.getY(), 2)) / GESCHWENDIGKEIT) * 60;
            if (!baustellen.isEmpty()) {
                if (baustellen.contains(ort)){
                    result += 15;
                }
            }
        }
        return result;
    }

    public void addBaustellen(Ort baustelle){
        baustellen.add(baustelle);
    }
}
