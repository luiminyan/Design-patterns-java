import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02{


    public static void main(String[] args){
        //create TreeSet
        Set<Person> treeSet01 = new TreeSet<>();

        //create people
        Person p1 = new Person("Milan", 51);
        Person p2 = new Person("Minhua", 24);
        Person p3 = new Person("Shipan", 25);
        Person p4 = new Person("Christoph", 34);
        Person p5 = new Person("Marsha", 20);

        List<Person> peopleList = new ArrayList<Person>( List.of( p1, p2, p3, p4, p5) );

        //adding
        for (Person p:peopleList) {
            treeSet01.add(p);
        }

        //listing out
        for (Person p : treeSet01) {
            System.out.println("Name: " + p.getName() + ", age: " + p.getAge());
        }
    }

}
