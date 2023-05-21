public abstract class Ente {
    protected QuakVerhalten quakVerhalten;
    protected FlugVerhalten flugVerhalten;


    public void quaken(){
        this.quakVerhalten.quaken();
    }
    public void fliegen(){
        this.flugVerhalten.fliegen();
    }

    public abstract void anzeigen();

}
