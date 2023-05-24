import java.util.Iterator;

public class Binaerbaum implements Iterable<Node>{
    //attributes
    private Node wurzeln;

    //functions
    public void addPerson(Person person){
        //if wurzeln is empty
        if (wurzeln == null) {
            wurzeln = new Node(person);
        }
        else {
            wurzeln.addRecursive(person);
        }
    }

    public Person findPersonByID(int id){
        if (wurzeln == null){
            return null;
        }
        else {
            return wurzeln.findRecursive(id);
        }
    }

    //the iterator function
    @Override
    public Iterator<Node> iterator() {
        //the standard iterator is the DFS iterator
        return null;
    }
}
