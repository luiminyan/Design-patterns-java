import java.awt.geom.Point2D;
import java.util.Iterator;

public class MalenNachZahlen implements Iterable<Point2D>{
    private Point2D[] Punkte;

    public MalenNachZahlen(){}

    public Iterator<Point2D> iterator(){
        return (Iterator<Point2D>) new MalenNachZahlenIterator();
    }

    public Point2D[] getPunkte(){
        return Punkte;
    }
}
