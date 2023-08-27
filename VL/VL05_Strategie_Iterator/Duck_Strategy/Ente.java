package Duck_Strategy;

public abstract class Ente {
    // attributes
    private QuakVerhalten quakVerhalten;     
    private FlugVerhalten flugVerhalten;
    
    // constructor
    public Ente(QuakVerhalten quakVerhalten, FlugVerhalten flugVerhalten) {
        this.quakVerhalten = quakVerhalten;
        this.flugVerhalten = flugVerhalten;
    }
    
    // to overwrite
    public void anzeige() {
        toQuaken();
        toFliegen();
    }

    // call the capsuled function and setters 
    public void toQuaken() {
        quakVerhalten.quaken();;
    }
     public void toFliegen() {
        flugVerhalten.fliegen();;
    }

    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        this.quakVerhalten = quakVerhalten;
    }
    
    public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }
}