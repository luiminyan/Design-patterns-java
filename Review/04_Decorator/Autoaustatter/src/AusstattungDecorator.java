public abstract class AusstattungDecorator implements Auto{
    protected Auto auto;
    public AusstattungDecorator(Auto auto){
        this.auto = auto;
    }

    @Override
    public abstract double getPreis();

    @Override
    public abstract void zeigePreis();
}
