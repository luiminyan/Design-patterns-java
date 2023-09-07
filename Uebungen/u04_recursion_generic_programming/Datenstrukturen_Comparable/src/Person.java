public class Person implements Comparable<Person>{
    private int id;
    private String name;
//    constructor 01
    public Person(int id, String name){
        this.name = name;
        this.id = id;
    }

    public Person(String name){
        this.name = name;
        this.id = (int) (Math.random() * 1000 + 1);
    }
//      getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    implements the compareTo() function of comparable
    @Override
    public int compareTo(Person p) {
        int anotherID = p.getId();
        return this.id - anotherID;
    }
}
