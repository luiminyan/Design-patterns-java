import java.util.ArrayList;
import java.util.Iterator;

public class NameRepository implements Iterable<String>{
    //attributes
    private ArrayList<String> nameList = new ArrayList<String>();

    //function iterator()
    @Override
    public Iterator<String> iterator() {
        return new NameIterator(this);
    }

    //getters and setters
    public ArrayList<String> getNameList() {
        return nameList;
    }

    public void setNameList(ArrayList<String> nameList) {
        this.nameList = nameList;
    }
}
