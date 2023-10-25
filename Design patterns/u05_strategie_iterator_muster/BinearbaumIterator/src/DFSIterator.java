import java.util.LinkedList;
import java.util.Stack;

public class DFSIterator extends BinaerbaumIterator{
    private Stack<Knote> knotenStack;
    private Stack<Knote> previousStack;

//    constructor
    public DFSIterator(Binaerbaum binaerbaum) {
        super(binaerbaum);
        knotenStack = new Stack<>();
        knotenStack.push(binaerbaum.getWuerzel());
        previousStack = new Stack<>();
    }

    //    implement funcs from abstract class KnotenIterator
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
