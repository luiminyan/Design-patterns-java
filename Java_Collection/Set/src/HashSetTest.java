import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args){
        //create new set
        Set<Person> hashSet01 = new HashSet<>();

        //create people
        Person p1 = new Person("Milan", 51);
        Person p2 = new Person("Minhua", 24);
        Person p3 = new Person("Shipan", 25);
        Person p4 = new Person("Christoph", 34);
        Person p5 = new Person("Marsha", 20);

        List<Person> peopleList = new ArrayList<Person>( List.of( p1, p2, p3, p4) );

        System.out.println("The adding: ");
        //add elements in hashSet
        for (Person p:peopleList) {
            if (hashSet01.add(p)) {
                System.out.println(p.getName() + " is added in the hashSet01.");
            }
        }

        System.out.println("\nThe containing: ");
        //contains
        for (Person p: peopleList) {
            if (hashSet01.contains(p)){
                System.out.println(p.getName() + " is contained in the hashSet01.");
            }
        }

        System.out.println("\nThe removing: ");
        //remove
        for (Person p: peopleList) {
            if (hashSet01.remove(p)){
                System.out.println(p.getName() + " is removed from the hashSet01.");
            }
        }

        System.out.println(hashSet01);
    }
}
