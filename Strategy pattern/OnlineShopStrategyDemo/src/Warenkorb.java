public class Warenkorb {
    //attributes
    private Zahlungsstrategie zahlungsstrategie;

    //constructor
    public Warenkorb(Zahlungsstrategie zahlungsstrategie){
        this.zahlungsstrategie = zahlungsstrategie;
    }

    //create function zahle()
    public void zahle(int preis){
        zahlungsstrategie.zahle(preis);     //call the function zahle() from class object zahlungsstrategie
    }
}
