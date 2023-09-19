import java.util.ArrayList;

public class Bauteil implements BauwerkKomponente{
    private String id;

    public Bauteil(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public ArrayList<BauwerkKomponente> filterBauwerk(String begriff) {
        ArrayList<BauwerkKomponente> result = new ArrayList<>();
        if (id.contains(begriff)) {
            result.add(this);
        }
        return result;
    }
}
