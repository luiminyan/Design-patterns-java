import java.util.Iterator;

public interface KnotenIterator extends Iterator<Node> {
    //to add more functions than the ordinary Iterator<Node> interface
    public Node peek();
    public Node previous();
}
