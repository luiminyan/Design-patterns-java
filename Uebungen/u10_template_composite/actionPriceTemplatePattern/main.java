import java.io.File;

public class main {
    public static void main(String[] args) {
        DatenHandler datenHandlerCSV = new CSVHandler(new File("DAX-2019-2020.csv"));
        Aktienkurs aktienkurs = datenHandlerCSV.einlesen();
        System.out.println(aktienkurs.getTageskurs().get(0).getDatum());

        DatenHandler datenHandlerTXT =  new TXTHandler(new File("dowjones_2019_2020.txt"));
        Aktienkurs aktienkurs02 = datenHandlerTXT.einlesen();
        System.out.println(aktienkurs02.getTageskurs().get(0).getDatum());
    }
}
