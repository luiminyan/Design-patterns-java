import java.util.ArrayList;

public interface BauwerkKomponente {
    public String getID();
    public ArrayList<BauwerkKomponente> filterBauwerk(String begriff);
}
