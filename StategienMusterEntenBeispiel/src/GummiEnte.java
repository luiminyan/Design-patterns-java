public class GummiEnte extends Ente{
    //constructor
    public GummiEnte(){
        super.flugVerhalten = new FliegtGarNicht();
        super.quakVerhalten = new Quietschen();
    }
    public void anzeigen(){}
}
