import java.util.Iterator;
import java.awt.geom.Point2D;


public class MalenNachZahlenIterator implements Iterator<Point2D>{
    // private Aggregate attribute
    private MalenNachZahlen aggregate;
    // the counter of the iterator
    private int index = 0;

    // hasNext()
    @Override
    public boolean hasNext() {
        return (index < aggregate.getPoints().length);
    }

    // next()
    @Override
    public Point2D next() {
        Point2D p = aggregate.getPoints()[index];
        index++;
        return p;
    }
}
