public abstract class BinaryTreeIterator implements KnotenIterator{
    //create data structure
    protected Binaerbaum tree;

    //constructor: to be called by iterator() in class Binaerbaum
    public BinaryTreeIterator(Binaerbaum tree){
        this.tree = tree;
    }

}
