import java.util.Iterator;

public interface KnotenIterator extends Iterator<Knote> {
//    add functions
    Knote peek();
    Knote previous();
}
