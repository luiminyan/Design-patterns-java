public class Main {
    public static void main(String[] args){
        Person[] personen = {
                new Person("Alice", 102),
                new Person("Bob", 57),
                new Person("Chris", 451),
                new Person("Diane", 13),
                new Person("Esther", 78),
                new Person("Fritz", 255),
                new Person("Gianni", 900),
                new Person("Hannah", 66),
                new Person("Irene", 377),
        };

        Binaerbaum binaerbaum = new Binaerbaum();     //注意泛型类型声明写在类型后面，而不是变量名后

        for (Person p:personen){
            binaerbaum.addPerson(p);
        }

        System.out.println("Who has ID of 102?\t" + binaerbaum.findPersonByID(102).getName());
        System.out.println("Who has ID of 57?\t" + binaerbaum.findPersonByID(57).getName());
        System.out.println("Who has ID of 57?\t" + binaerbaum.findPersonByID(377).getName());

    }
}
