public abstract class TrankEffektDecorator implements Charakter{
    //attribute
    protected Charakter charakter;
    protected String bezeichnung;

    //constructor
    public TrankEffektDecorator(Charakter charakter){
        this.charakter = charakter;
    }

    //abstract class does not need to implement the methods from the implemented interface Charakter
}
