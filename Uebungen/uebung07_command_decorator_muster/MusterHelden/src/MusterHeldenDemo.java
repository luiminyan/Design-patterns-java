public class MusterHeldenDemo {
    public static void main(String[] args){
        //create new charakters
        Charakter magier01 = new Magier();
        Charakter waldlaeufer01 = new Waldlaeufer();


        //decorate them with the drank effect
        magier01 = new TrankDerVitalitaet(magier01);
        magier01.getRuestungswert();
        magier01.getTrefferpunkte();

        Charakter waldlaeufer02 = new TrankDesBarbaren(new Waldlaeufer());
        waldlaeufer02.getTrefferpunkte();
        waldlaeufer02.getRuestungswert();


    }
}
