public abstract class AbstractFilter implements IFilter{
    private Bild bild;
    public AbstractFilter(Bild bild){
        this.bild = bild;
    }
    @Override
    public abstract void anwenden();
}
