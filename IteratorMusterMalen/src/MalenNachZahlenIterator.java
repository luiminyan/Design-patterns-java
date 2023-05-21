import java.awt.geom.Point2D;
import java.util.Iterator;

public class MalenNachZahlenIterator implements Iterator<Point2D> {
    private MalenNachZahlen aggregate;
    private int index = 0;

    //constructor
    public MalenNachZahlenIterator(){}

    public Point2D next(){
        Point2D p = aggregate.getPunkte()[index];
        index++;
        return p;
    }

    public boolean hasNext(){
        /*if(index < aggregate.getPunkte().length){
            return true;
        }
        else return false;*/

        return index < aggregate.getPunkte().length;
    }
}
