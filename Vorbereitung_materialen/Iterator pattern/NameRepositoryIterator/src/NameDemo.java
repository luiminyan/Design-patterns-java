import java.util.ArrayList;
import java.util.Iterator;

public class NameDemo {
    public static void main(String[] args){
        //create iterable object /aggregate
        NameRepository nameRepository01 = new NameRepository();
        ArrayList list01 = new ArrayList<String>();
        list01.add("Minhua");
        list01.add("Milan");
        list01.add("Shipan");

        nameRepository01.setNameList(list01);

        //create iterator
        Iterator nameIterator01 = nameRepository01.iterator();
        while (nameIterator01.hasNext()){
            String name = (String) nameIterator01.next();
            System.out.println(name);
        }
    }
}
