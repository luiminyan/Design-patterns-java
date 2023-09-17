public class Main {
    public static void main(String[] args) {
        AutoStrategy autoStrategy = new AutoStrategy();
        autoStrategy.addBaustellen(new Ort("Bochum", 12.0, 15.0 ));
        NaviApp naviApp01 = new NaviApp(new AutoStrategy());
        Ort[] route = new Ort[4];
        route[0] = new Ort("Bochum", 12, 15);
        route[1] = new Ort("Wattenscheid", 25, 18);
        route[2] = new Ort("Essen", 30, 20);
        route[3] = new Ort("Mülheim", 35, 25);
        System.out.println("Auto: " + naviApp01.berechneZeit(route));

        NaviApp naviApp02 = new NaviApp(new FarradStrategy());
        System.out.println("Fahrrad: " + naviApp02.berechneZeit(route));
    }
}