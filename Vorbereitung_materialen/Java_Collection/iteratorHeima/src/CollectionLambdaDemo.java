import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionLambdaDemo {
    public static void main(String[] args){
        //create collection
        Collection<String> collection = new ArrayList<>();

        //add elements
        collection.add("Zhang San");
        collection.add("Li Si");
        collection.add("Wang Wu");
        collection.add("Zhao Liu");

        //使用内部匿名类：new 接口 作为parameter
        collection.forEach(new Consumer<String>() {     //new 接口
            @Override
            public void accept(String s) {
                //s 依次表示集合中的每一个数据
                System.out.println(s);
            }
        });

        /*
         * lambda表达式
         * (parameter) -> {function details}
         */
        //使用lambda表达式重写accept函数
        collection.forEach( (String s) -> {
            System.out.println(s);
        });

    }

}
