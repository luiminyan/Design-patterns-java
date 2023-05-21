public class CD extends Artikel implements Umtauschbar, Abspielbar{
    //attributes
    private int laufzeit;
    private String komponist;

    //constructor
    public CD(String titel, double preis, long barcode, int laufzeit, String komponist){
        super(titel, preis, barcode);    //使用parameter，保证顺序，调用super的构造方法
        this.laufzeit = laufzeit;
        this.komponist = komponist;
    }

    //functions
    @Override
    public String getBeschreibung(){
        return "\"" + titel + "\"" + " von " + komponist + ", " + laufzeit + " Minuten";
    }

    @Override
    public int umtauschfrist(){
        return 14;
    }

    @Override
    public int getAbspieldauer() {
        return laufzeit;
    }

    @Override
    public void spieleAb(){
        System.out.println(titel + " wird abgespielt");
    }


}
