public class Person implements Comparable<Person>{
    //attribute
    private String name;
    private int age;

    //constructor
    public Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //implement comparable
    @Override
    public int compareTo(Person anotherP) {
        return (age - anotherP.getAge());
    }
}
