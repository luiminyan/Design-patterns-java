public class BuyStock implements Order{
    //attribute
    private Stock stock;

    //constructor
    public BuyStock(Stock s){
        this.stock = s;
    }

    //overwrite the method in the interface Order
    @Override
    public void execute() {
        stock.buy();
    }
}
