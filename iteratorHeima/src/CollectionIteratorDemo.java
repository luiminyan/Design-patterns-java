import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;  //for iterator

public class CollectionIteratorDemo {
    public static void main(String[] args){
        //1. 创建集合
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        //2. 创建iterator / 迭代对象
        Iterator<String> iterator1 = collection.iterator();

        //3.iteration
        while (iterator1.hasNext()){
            //4. next()：先获取当前元素，再移动指针
            String item = iterator1.next();
            System.out.println("The value of the list item is " + item);
        }

        //上述循环结束以后，迭代器指向没有元素的空位置
        try {
            //再来一次next
            System.out.println("The value of the list item is " + iterator1.next());
        }catch (Exception exception){
            System.out.println("The exception is " + exception);    //如果出现error，打印出来
        }

        //遍历完成，iterator不会复位
        System.out.println(iterator1.hasNext());     //false

        //重建iterator
        Iterator<String> iterator2 = collection.iterator();
        while (iterator2.hasNext()){
            String item = iterator2.next();
            System.out.println("The value of the list item is " + item);
        }
    }
}
