public class FordFiesta implements Auto{
    @Override
    public double getPreis() {
        return 3500;
    }

    @Override
    public void zeigePreis() {
        System.out.println("FordFiesta: " + getPreis());
    }
}
