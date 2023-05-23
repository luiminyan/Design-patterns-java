public class KreditkartenStrategie implements Zahlungsstrategie{
    //attributes
    private String name;
    private String nummer;
    private String cvv;
    private String ablaufDatum;

    //constructor
    public KreditkartenStrategie(String name, String nummer, String cvv, String ablaufDatum){
        this.name = name;
        this.nummer = nummer;
        this.cvv = cvv;
        this.ablaufDatum = ablaufDatum;
    }


    //implement zahle from interface
    @Override
    public void zahle(int preis){
        System.out.println("Name: " + name + "\tNummer: " + nummer + "\tPreis: " + preis + "\tAblaufdatum: " + ablaufDatum);
    }

}
