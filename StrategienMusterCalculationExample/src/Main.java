public class Main {
    public static void main(String[] args){
        Context context1 = new Context(new OperationAdd()); //parameter是strategy
        System.out.println("10 + 5 = " +context1.executeStrategy(10, 5));

        Context context2 = new Context(new OperationMultiply()); //parameter是strategy
        System.out.println("10 * 5 = " +context2.executeStrategy(10, 5));

        Context context3 = new Context(new OperationSubstract()); //parameter是strategy
        System.out.println("10 - 5 = " +context3.executeStrategy(10, 5));

    }
}
