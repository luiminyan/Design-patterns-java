public class Main {
    public static void main(String[] args) {
        Binaerbaum binaerbaum = new Binaerbaum();
        binaerbaum.hinzufuegen(new Person(66, "Hannah"));
        binaerbaum.hinzufuegen(new Person(377, "Irene"));
        binaerbaum.hinzufuegen(new Person(13, "Diane"));
        binaerbaum.hinzufuegen(new Person(78, "Esther"));
        binaerbaum.hinzufuegen(new Person(255, "Fritz"));
        binaerbaum.hinzufuegen(new Person(900, "Gianni"));
        binaerbaum.hinzufuegen(new Person(57, "Bob"));
        binaerbaum.hinzufuegen(new Person(451, "Chris"));
        binaerbaum.hinzufuegen(new Person(102, "Alice"));

       System.out.println(binaerbaum.getWuerzel().getPerson().getName());
    }
}