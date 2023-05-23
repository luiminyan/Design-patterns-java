public class GummiEnte extends Ente{
    //constructor
    public GummiEnte(){
        super.quakVerhalten =  new Quietschen();
        super.flugVerhalten =  new FliegtGarNicht();
    }
}
