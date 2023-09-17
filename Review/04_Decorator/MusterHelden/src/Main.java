public class Main {
    public static void main(String[] args) {
        Charakter charakter01 = new Magier();
        charakter01 = new TrankDerVitalitaet(charakter01);
        showCharacter(charakter01);
    }
    private static void showCharacter(Charakter charakter) {
        System.out.println(" (TP: " + charakter.getTrefferpunkte() + ", RW: " + charakter.getRuestungswert() + ")");
    }
}