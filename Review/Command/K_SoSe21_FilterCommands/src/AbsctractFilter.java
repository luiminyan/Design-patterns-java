public class AbsctractFilter implements IFilter{
    private Bild bild;
    public AbsctractFilter(Bild bild) {
        this.bild = bild;
    }
    @Override
    public void anwenden() {
        System.out.println("Bild mit Pixeln " + bild.getPixels() + " ist angewendet!");
    }
}
