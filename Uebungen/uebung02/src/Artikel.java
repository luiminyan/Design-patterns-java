public abstract class Artikel {
    //attributes
    protected String titel;
    protected double preis;
    protected long barcode;

    //constructor
    public Artikel (String titel, double preis, long barcode){
        this.titel = titel;
        this.preis = preis;
        this. barcode = barcode;
    }

    //functions
    public String getTitel(){
        return titel;
    }
    public double getPreis(){
        return preis;
    }
    public long getBarcode() {
        return barcode;
    }
    public abstract String getBeschreibung();   //abstract function 必须写在abstract class里，不写大括号

}
