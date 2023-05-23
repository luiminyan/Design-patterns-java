import java.util.Stack;

public class DFSIterator extends BinaryTreeIterator{
    //attributes
    private Stack<Node> nodeStack;

    //constructor
    public DFSIterator(Binaerbaum tree){
        super(tree);
    }

    //the extra functions from BinaryTreeIterator
    @Override
    public Node peek() {
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
