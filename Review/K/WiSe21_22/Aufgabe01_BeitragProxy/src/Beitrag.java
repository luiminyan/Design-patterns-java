public class Beitrag implements IBeitrag{
    private String name;
    private String inhalt;
    public Beitrag(String name, String inhalt) {
        this.name = name;
        this.inhalt = inhalt;
    }

    @Override
    public String getNutzername() {
        return name;
    }

    @Override
    public String getInhalt() {
        return inhalt;
    }
}
