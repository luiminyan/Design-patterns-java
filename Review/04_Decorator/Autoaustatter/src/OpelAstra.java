public class OpelAstra implements Auto{
    @Override
    public double getPreis() {
        return 7500;
    }

    @Override
    public void zeigePreis() {
        System.out.println("Opel Astra: " + getPreis());
    }
}
