public abstract class Ente {
    //attributes
    protected FlugVerhalten flugVerhalten;
    protected QuakVerhalten quakVerhalten;

    //constructor
    public Ente(){}

    //functions
    public void quaken(){
        this.quakVerhalten.quaken();
    }
    public void fliegen() {
        this.flugVerhalten.fliegen();
    }
    //getters and setters
    public FlugVerhalten getFlugVerhalten() {
        return flugVerhalten;
    }

    public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }

    public QuakVerhalten getQuakVerhalten() {
        return quakVerhalten;
    }

    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        this.quakVerhalten = quakVerhalten;
    }
}
