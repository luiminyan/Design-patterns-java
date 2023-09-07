import java.util.Iterator;

public abstract class BinaerbaumIterator implements KnotenIterator {
//    ABSTRACT class does not need to implement parent functions
//    Aggregate attribute
    protected Binaerbaum binaryTree;
//    constructor
    public BinaerbaumIterator(Binaerbaum binaryTree){
        this.binaryTree = binaryTree;
    }
}
