public class RauschenFilter extends AbstractFilter{
    public RauschenFilter(Bild bild) {
        super(bild);
    }

    @Override
    public void anwenden(){
        System.out.println("Bild ist durch Rauschen gefiltet.");
    }
}
