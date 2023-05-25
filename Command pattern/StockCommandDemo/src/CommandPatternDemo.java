public class CommandPatternDemo {
    public static void main(String[] args){
        //create stock - request side
        Stock stockAbc = new Stock("ABC",100);

        //create orders - are capsuled in interface
        BuyStock buyStockABC =  new BuyStock(stockAbc);
        SellStock sellStockABC =  new SellStock(stockAbc);

        //create broker execute side
        Broker broker = new Broker();
        broker.takeOrder(buyStockABC);
        broker.takeOrder(sellStockABC);

        broker.placeOrders();
    }
}
