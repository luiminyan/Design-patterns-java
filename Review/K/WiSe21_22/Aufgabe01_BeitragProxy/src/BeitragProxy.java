public class BeitragProxy implements IBeitrag{
//    create RealClass
    private IBeitrag beitrag;
    private String[] schaedlicheLinks = {"getmalware.test", "freeram.example", "notavirus.invalid"};
    public BeitragProxy(Beitrag beitrag) {
        this.beitrag = beitrag;
    }

    @Override
    public String getNutzername() {
        String username = beitrag.getNutzername();
        return replaceSchaedlich(username);
    }

    @Override
    public String getInhalt() {
        String inhalt = beitrag.getInhalt();
        return replaceSchaedlich(inhalt);
    }

    public String replaceSchaedlich(String text) {
        for (String link : schaedlicheLinks) {
            text = text.replace(link, "[Link blockiert]");
//            replace does not modify the original text
        }
        return text;
    }
}
