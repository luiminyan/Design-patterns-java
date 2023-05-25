import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        //create stack
        Stack<Integer> stack01 = new Stack<>(); //cannot be primitive type

        //push (last in)
        stack01.push(100);
        stack01.push(20);
        stack01.push(9);

        //pop (first out)
        int i = stack01.pop();
        System.out.println("The popped out element is " + i);   //pop出追后添加的元素

        //peek
        System.out.println("peek(): " + stack01.peek());    //peek最后添加的元素

        //iterate：从最先添加的元素开始读
        for (int item: stack01) {
            System.out.println(item);
        }

    }
}
