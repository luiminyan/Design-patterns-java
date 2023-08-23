import java.lang.reflect.Parameter;

public class Person {
    String lieblingsfarbe;

    private int alter;

    //constructors
    public Person(){
        lieblingsfarbe = "gelb";
    }

    public Person(String lieblingsfarbe, int alter){
        this.lieblingsfarbe = lieblingsfarbe;   //this: Parameter überdeckt Attribute

        this.alter = alter;
    }

    //getter

    public int getAlter() {
        return alter;
    }
}
