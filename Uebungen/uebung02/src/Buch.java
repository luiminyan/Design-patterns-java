public class Buch extends Artikel implements Umtauschbar{
    //attributes
    private int seiten;
    private String autor;
    private int auflage;

    //constructor
    public Buch(String titel, double preis, long barcode, int seiten, String autor, int auflage){
        super(titel, preis, barcode);
        this.seiten = seiten;
        this.autor = autor;
        this.auflage = auflage;
    }

    //functions
    @Override
    public String getBeschreibung(){
        return "\"" + super.titel + "\"" + " von " + autor + ", " + auflage + ",. Auflage, " + seiten + " Seiten";
    }

    public int getSeiten() {
        return seiten;
    }

    public String getAutor() {
        return autor;
    }

    public int getAuflage() {
        return auflage;
    }

    //override the abstract function
    @Override
    public int umtauschfrist() {
        return 30;
    }
}
