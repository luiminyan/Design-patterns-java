import java.util.ArrayList;

public class AutoStrategie implements ReiseStrategie{
//  attribute
    private ArrayList<Ort> baustellen;

//    constructor
    public AutoStrategie(){
           this.baustellen = new ArrayList<>();
    }

//implement the capsuled function from interface
    @Override
    public double berechneZeit(Ort[] route) {
        double zeit = 0.0;
        if (baustellen.isEmpty()) {
            return 0;
        }
        else for (Ort ort : route) {
//              arrayList.contains(elem.)
            if (baustellen.contains(ort)) {
                zeit += 15;
            }
        }
        return zeit;
    }

//    function addBaustelle()
    public void addBaustelle(Ort ort){
        baustellen.add(ort);
        System.out.println(ort.getName() + " ist als Baustelle hinzugefügt!");
    }
}
