public abstract class TrankEffektDecorator implements Charakter{
    protected Charakter c;
    protected String bezeichnung;
    public TrankEffektDecorator(Charakter c, String bezeichnung) {
        this.c = c;
        this.bezeichnung = bezeichnung;
    }
}
