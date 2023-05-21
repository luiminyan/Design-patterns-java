public class Context {
    private Strategy strategy;  //strategy的实例
    //constructor
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    //operations
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
