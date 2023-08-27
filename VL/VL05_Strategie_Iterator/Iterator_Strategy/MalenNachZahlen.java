import java.awt.geom.Point2D;
import java.util.Iterator;

public class MalenNachZahlen implements Iterable<Point2D>{
    // datastructure for the to-be-iterated thing
    private Point2D[] points;

    // constructor
    public MalenNachZahlen(Point2D[] points) {
        this.points = points;
    }

    // iterator()
    @Override
    public Iterator<Point2D> iterator() {
        // return a new concrete iterator
        return new MalenNachZahlenIterator();
    }

    // getters and setters: important for the conc.iterator class
    public Point2D[] getPoints() {
        return points;
    }

    public void setPoints(Point2D[] points) {
        this.points = points;
    }

    
}