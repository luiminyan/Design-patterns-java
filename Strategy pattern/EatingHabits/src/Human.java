public abstract class Human {
    //attributes
    protected Strategy strategy;

    //constructor
    public Human(){}

    //functions
    public void eat(){
        strategy.eat();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
