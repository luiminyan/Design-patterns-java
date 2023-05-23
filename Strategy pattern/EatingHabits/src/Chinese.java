public class Chinese extends Human{
    //constructor
    public Chinese(){
        super.strategy = new StrategyImpCN();
    }
}
