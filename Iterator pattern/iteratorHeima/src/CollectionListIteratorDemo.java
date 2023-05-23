import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionListIteratorDemo {
    public static void main(String[] args){
        //create list
        List list1 = new ArrayList(){};

        //add elements
        list1.add("I");
        list1.add("love");
        list1.add("Milan");
        list1.add("dumbass");
        list1.add(".");

        //create ListIterator
        ListIterator<String> iterator1 = list1.listIterator();  //只有list类有listIterator
        while (iterator1.hasNext()){
            String item = iterator1.next();
            if ("I".equals(item)) {
                //list1.add("don't");       //不可使用list的方法修改元素
                iterator1.add("don't");
            }
        }
        System.out.println("List = " + list1);

    }
}
