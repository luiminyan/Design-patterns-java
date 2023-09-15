import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        //create queue
        Queue<String> queue01 = new LinkedList<>();

        //add elements
        queue01.offer("Apple");
        queue01.offer("Pear");
        queue01.offer("Grapes");

        //delete elements from the list top
        System.out.println(queue01.poll());
        System.out.println(queue01.poll());
        System.out.println(queue01.poll());
        System.out.println(queue01.poll());     //empty queue: return null by calling poll()

        System.out.println(queue01.offer(null));    //添加null元素
        System.out.println(queue01.peek());
    }
}
