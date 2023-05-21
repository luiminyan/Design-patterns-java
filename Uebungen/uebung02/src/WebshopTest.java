public class WebshopTest {
    public static void main(String[] args) {
        Buch b1 = new Buch("UML 2.0", 9.8, 9783897215214L, 139,
                "Dan Pilone", 2);               //"UML 2.0" von Dan Pilone, 2. Auflage, 139 Seiten
        System.out.println(b1.getBeschreibung());
        System.out.println("Preis: " + b1.getPreis() + " Euro");
        System.out.println("Barcode: " + b1.getBarcode());

        Buch b2 = new Buch("Theoretische Informatik", 32.9, 101378174341L, 400, "Uwe Schöning", 3);
        if (b1.getPreis() >= b2.getPreis()) System.out.println(b1.getBeschreibung());
        else System.out.println(b2.getBeschreibung());

        CD cd1 = new CD("Micheal", 20.4, 362165786329L, 300, "Micheal Jackson");
        System.out.println(cd1.getBeschreibung());

        // Buch[] listeAlt = new Buch[] {b1, b2};
        //Artikel[] liste = new Artikel[]{b1, b2, cd1};

        DVD dvd1 = new DVD("Snow White", 15.6, 463232515862L, "Somebody", 1965, 120);
        Bluray dvd2 = new Bluray("Apple farmer", 29.3, 5748249691264L, "Nobody", 2003, 80);

        Artikel[] liste = new Artikel[]{b1, b2, cd1, dvd1, dvd2};
        for (int i = 0; i < liste.length; i++){
            System.out.println(liste[i].getBarcode() + "\t" + liste[i].getBeschreibung());
        }

        //return all barcodes of bucher from the list
        for (int i = 0; i < liste.length; i++){
            if (liste[i] instanceof Buch){
                System.out.println(liste[i].getBarcode());
            }
        }

        //return sum of price of DVDs, but not Blu-rays
        int sum = 0;
        for (int i = 0; i < liste.length; i++){
            if ((liste[i] instanceof DVD) & !(liste[i] instanceof Bluray)) sum += liste[i].getPreis();
        }
        System.out.println("Der Gesamtpreis von nicht Blu-ray DVDs ist " + sum);

        for(int i = 0; i < liste.length; i++) {
            if(liste[i] instanceof Buch) {
                Buch b = (Buch)liste[i];
                System.out.println(b.getAutor());
            }
        }

        //return all fristen from umtauschbare artikeln
        for (Artikel a : liste){
            if (a instanceof Umtauschbar) System.out.println("Umtauschfrist von " + a.getBarcode() + " ist " + ((Umtauschbar) a).umtauschfrist());
        }

        for (Artikel a : liste){
            if (a instanceof Abspielbar){
                Abspielbar ab = (Abspielbar) a;     //casting,如果想调用子类function
                if (ab.getAbspieldauer() >= 90) ab.spieleAb();
            }
        }

    } }