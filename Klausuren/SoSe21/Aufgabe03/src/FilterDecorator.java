public abstract class FilterDecorator implements IFilter{
    protected IFilter iFilter;
    protected int times;
    public FilterDecorator(IFilter iFilter, int times){
        this.iFilter = iFilter;
        this.times = times;
    }
    public abstract void anwenden();
}
