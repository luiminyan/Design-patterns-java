public class Warenkorb {
    private Zahlungsstrategie zahlungsstrategie;
//    constructor
    public Warenkorb(Zahlungsstrategie zahlungsstrategie){
        this.zahlungsstrategie = zahlungsstrategie;
    }
    public void zahle(int preis) {
//        call the zahle() in zahlungsstrategie
        zahlungsstrategie.zahle(preis);
    }
}
