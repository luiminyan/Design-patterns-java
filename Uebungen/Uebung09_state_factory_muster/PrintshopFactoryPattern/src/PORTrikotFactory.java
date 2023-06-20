public class PORTrikotFactory extends AbstractTrikotFactory{
    //attribute
    Spielertrikot spielerTrikot = new Spielertrikot();

    //implement function
    @Override
    public Trikot erstelleTrikot(String name, int nummer) {
        spielerTrikot.setFront(name, nummer, "POR");
        spielerTrikot.setBack(name, nummer);
        return spielerTrikot;
    }
}
