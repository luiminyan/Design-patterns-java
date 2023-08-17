package menuAdministration;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent>{
    // implement functions from Iterator

    // hasNext()
    @Override
    public boolean hasNext() {
        return false;
    }

    // next()
    @Override
    public MenuComponent next() {
        return null;
    }

    /* 
    @Override
    public void remove() {
        throw new UnsupportedoperationException();
    }
     */   
}
