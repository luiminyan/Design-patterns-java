import java.util.AbstractList;
import java.util.Collection;

public class KontoWebList extends AbstractList<Konto>{
    // attributes
    private String username;
    private String password;

    // constructor
    public KontoWebList (String username, String password) {
        this.username = username;
        this.password = password;
    }

    // implement methods from abstract class AbstractList
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean addAll(Collection<? extends Konto> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public Konto get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }



}
