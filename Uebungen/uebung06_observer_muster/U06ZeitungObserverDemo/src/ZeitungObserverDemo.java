public class ZeitungObserverDemo {
    public static void main(String[] args){
        //create a new press
        ZeitungsVerlag elsevier = new ZeitungsVerlag("elsevier");

        //create abonnents
        Abonnent abonnent01 = new Abonnent("Max Mustermann");
        Abonnent abonnent02 = new Abonnent("Lehrstuhl fuer Informatik im Bauwesen");

        //connect
        elsevier.registiereAbonnent(abonnent01);
        elsevier.registiereAbonnent(abonnent02);
        elsevier.verteileZeitung("Java Design Patterns");

    }
}
