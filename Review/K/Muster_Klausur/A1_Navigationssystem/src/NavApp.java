import java.util.ArrayList;

public class NavApp {
//    attr: Strategie
    private ReiseStrategie reiseStrategie;

//    constructor
    public NavApp(ReiseStrategie reiseStrategie){
        this.reiseStrategie = reiseStrategie;
    }

    public double berechneZeit(Ort[] route){
        return reiseStrategie.berechneZeit(route);
    }
}
