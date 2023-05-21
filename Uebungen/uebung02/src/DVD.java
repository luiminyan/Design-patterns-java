public class DVD extends Artikel implements Abspielbar{
    //attributes
    protected String regisseur;
    protected int erscheinungsjahr;
    protected int abspieldauer;

    //constructor
    public DVD(String titel, double preis, long barcode, String regisseur, int erscheinungsjahr, int abspieldauer){
        super(titel, preis, barcode);
        this.regisseur = regisseur;
        this.erscheinungsjahr = erscheinungsjahr;
        this.abspieldauer = abspieldauer;
    }
    @Override
    public String getBeschreibung(){                //all abstract methods from the parent class muss be implemented
        return "\"" + super.titel + "\"" + " von " + regisseur + ", " + " im Jahr " + erscheinungsjahr;
    }

    @Override
    public int getAbspieldauer(){
        return abspieldauer;
    }

    @Override
    public void spieleAb(){
        System.out.println(titel + " wird abgespielt");
    }

}
