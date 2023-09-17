public class AllWetterReifen extends AusstattungDecorator{
    public AllWetterReifen(Auto auto) {
        super(auto);
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 725;
    }

    @Override
    public void zeigePreis() {
        auto.zeigePreis();
        System.out.println("\t + Allwetterreifen: " + this.getPreis());
    }
}
