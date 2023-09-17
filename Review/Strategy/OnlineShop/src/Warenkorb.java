public class Warenkorb {
    private Zahlungstrategie zahlungstrategie;
    public Warenkorb(Zahlungstrategie zahlungstrategy){
        this.zahlungstrategie = zahlungstrategy;
    }
    public void zahle(int preis){
        zahlungstrategie.zahle(preis);
    }
}
