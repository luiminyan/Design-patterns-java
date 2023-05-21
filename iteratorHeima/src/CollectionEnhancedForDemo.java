import java.util.ArrayList;
import java.util.Collection;

public class CollectionEnhancedForDemo {
    public static void main(String[] args){
        //create collection
        Collection<String> collection = new ArrayList<>();

        //add elements
        collection.add("Zhang San");
        collection.add("Li Si");
        collection.add("Wang Wu");
        collection.add("Zhao Liu");

        //增强for不会修改collection中原本的数据
        for (String item:collection) {
            item = "sssss";     //第三方变量item的值被改变，不影响集合
        }

        //iteration
        for (String item:collection) {
            System.out.println("Item: " + item);
        }

    }



}
