public class Person {
    String name;
    int age;

    static String category = "Human";   //test static
    final boolean ifIntelligent = true; //test final

    static final boolean canSpeak = true;

    //constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getters and setters
    static public String getCategory(){
        return category;
    }

    public boolean getIfIntelligent(){
        return ifIntelligent;
    }

    /*public void setIfIntelligent(){       //不能给final重新赋值
        ifIntelligent = !ifIntelligent;
    }*/

}
