public class Bluray extends DVD{
    //constructor
    public Bluray(String titel, double preis, long barcode, String regisseur, int erscheinungsjahr, int abspieldauer){
        super(titel, preis, barcode, regisseur, erscheinungsjahr, abspieldauer);
    }

    //rewrite function
    public String getBeschreibung(){
        return "\"" + super.titel + "\"" + " von " + super.regisseur + ", " + " im Jahr " + super.erscheinungsjahr + ", Bluray";
    }
}
