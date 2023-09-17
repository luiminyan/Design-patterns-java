public class KlimaAnlage extends AusstattungDecorator{
    public KlimaAnlage(Auto auto) {
        super(auto);
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 550;
    }

    @Override
    public void zeigePreis() {
        auto.zeigePreis();
        System.out.println("\t + Klimaanlage: " + this.getPreis());
    }
}
