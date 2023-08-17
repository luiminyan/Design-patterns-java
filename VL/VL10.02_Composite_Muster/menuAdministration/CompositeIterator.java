package menuAdministration;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent>{
    // stack for iteration
    Stack<MenuComponent> toVisit = new Stack<MenuComponent>();

    // constructor
    public CompositeIterator(MenuComponent menuComponent) {
        // 推入栈顶
        toVisit.push(menuComponent);
    }

    @Override
    public boolean hasNext() {
        return !(toVisit.isEmpty());
    }

    @Override
    public MenuComponent next() {
       if (hasNext()) {
            MenuComponent menuComp = toVisit.pop();
            int index  = 0;
            for (MenuComponent tmp : menuComp) {
                toVisit.insertElementAt(menuComp, index);
                index++;
            }
            return menuComp;
       }
       else return null;
    }

    /* 
        @Override
        public void remove() {
            throw new UnsupportedoperationException();
        }
     */      
}
