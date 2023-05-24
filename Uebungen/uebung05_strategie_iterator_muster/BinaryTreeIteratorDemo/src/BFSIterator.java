import java.util.Queue;

public class BFSIterator extends BinaryTreeIterator{
    //attributes
    private Queue<Node> nodeQueue;

    //constructor
    public BFSIterator(Binaerbaum tree){
        super(tree);


    }

    //the extra functions from BinaryTreeIterator
    @Override
    public Node peek() {
        //check the top of the queue without deleting it
        return null;
    }

    @Override
    public Node previous() {
        return null;
    }

    //from iterator
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Node next() {
        return null;
    }
}
