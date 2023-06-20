public class GERTrikotFactory extends AbstractTrikotFactory{
    //attribute
    Spielertrikot spielerTrikot = new Spielertrikot();

    //implement function
    @Override
    public Trikot erstelleTrikot(String name, int nummer) {
        spielerTrikot.setFront(name, nummer, "GER");
        spielerTrikot.setBack(name, nummer);
        spielerTrikot.drucke();
        return spielerTrikot;
    }
}
