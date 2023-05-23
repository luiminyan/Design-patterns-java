public class Person {
    //attributes
    private String name;
    private int id;

    //constructors
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Person(String name){
        this.name = name;
        this.id = (int) Math.random()*1000;     //need a casting from double to int
    }

    //getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
