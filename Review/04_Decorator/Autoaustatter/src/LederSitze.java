public class LederSitze extends AusstattungDecorator{
    public LederSitze(Auto auto) {
        super(auto);
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 144.99;
    }

    @Override
    public void zeigePreis() {
        auto.zeigePreis();
        System.out.println(" \t + Ledersitze: " + this.getPreis());
    }
}
