public class WeichzeichnenFilter extends AbstractFilter{
    public WeichzeichnenFilter(Bild bild) {
        super(bild);
    }
    @Override
    public void anwenden(){
        System.out.println("Bild ist durch Weichzeichnen gefiltet.");
    }
}
