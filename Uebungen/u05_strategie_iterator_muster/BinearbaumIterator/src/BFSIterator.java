import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSIterator extends BinaerbaumIterator{
    private Queue<Knote> knotenQueue;
    private Stack<Knote> previousStack;
//    constructor


    public BFSIterator(Binaerbaum binaryTree) {
        super(binaryTree);
        this.knotenQueue = new LinkedList<>();
//        add root
        this.knotenQueue.add(binaryTree.getWuerzel());
        this.previousStack = new Stack<>();
    }

    //    implement funcs from abstract class BinaerbaumIterator
    @Override
    public Knote peek() {
        return null;
    }

    @Override
    public Knote previous() {
        return null;
    }

//  implement func. from interface Iterator<Knote> interface
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Knote next() {
        return null;
    }
}
