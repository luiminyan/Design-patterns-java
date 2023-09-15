import java.util.ArrayList;

public class NavApp {
//    attr: Strategie
    private ReiseStrategie reiseStrategie;
    private ArrayList<Ort> route;
//    constructor
    public NavApp(ReiseStrategie reiseStrategie , ArrayList<Ort> route){
        this.reiseStrategie = reiseStrategie;
        this.route = route;
    }

    public double berechneZeit(){
        return reiseStrategie.berechneZeit(route);
    }
}
