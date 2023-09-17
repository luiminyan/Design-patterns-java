public class NaviApp {
//    strategy
    private ReiseStrategy reiseStrategy;
    public NaviApp(ReiseStrategy reiseStrategy){
        this.reiseStrategy = reiseStrategy;
    }

    public double berechneZeit(Ort[] route){
        return reiseStrategy.berechneZeit(route);
    }
}
