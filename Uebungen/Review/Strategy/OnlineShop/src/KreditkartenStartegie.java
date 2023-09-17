public class KreditkartenStartegie implements Zahlungstrategie{
    private String name;
    private String nummer;
    private String cvv;
    private String ablaufdatum;
    public KreditkartenStartegie(String name, String nummer, String cvv, String ablaufdatum){
        this.name = name;
        this.nummer = nummer;
        this.cvv = cvv;
        this.ablaufdatum = ablaufdatum;
    }
    @Override
    public void zahle(int preis) {
        System.out.println("Name: " + name + ", Kartennummer: " + nummer + ", Preis: " + preis + " Euro.");
    }
}
