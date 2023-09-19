import java.util.ArrayList;

public class BauteilGruppe implements BauwerkKomponente{
    private String id;
    private ArrayList<BauwerkKomponente> komponenten;

    public BauteilGruppe(String id) {
        this.id = id;
        komponenten = new ArrayList<>();
    }

//    modify component list
    public void add(BauwerkKomponente b){
        komponenten.add(b);
    }
    public void remove(BauwerkKomponente b){
        komponenten.remove(b);
    }
//      override methods from interface
    @Override
    public String getID() {
        return id;
    }

    @Override
    public ArrayList<BauwerkKomponente> filterBauwerk(String begriff){
        ArrayList<BauwerkKomponente> result = new ArrayList<>();
        if (this.id.contains(begriff)){
            result.add(this);
        }
        for (BauwerkKomponente komponent : komponenten) {
            if (komponent.getID().contains(begriff)){
                result.add(komponent);
            }
        }
        return result;
    }
}
