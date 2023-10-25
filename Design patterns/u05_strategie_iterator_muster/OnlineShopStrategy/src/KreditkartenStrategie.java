public class KreditkartenStrategie implements Zahlungsstrategie{
    private String name;
    private String nummer;
    private String cvv;
    private String ablaufdatum;

//    constructor
    public KreditkartenStrategie(String name, String nummer, String cvv, String ablaufdatum) {
        this.name = name;
        this.nummer = nummer;
        this.cvv = cvv;
        this.ablaufdatum = ablaufdatum;
    }
    @Override
    public void zahle(int preis) {
        System.out.println("Preis: " + preis + ", Name: " + name +  ", Kratennummer: " + nummer);
    }
}
