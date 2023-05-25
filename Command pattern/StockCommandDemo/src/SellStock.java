public class SellStock implements Order{
    //attribute
    private Stock stock;    //store a stock / request side object

    //constructor
    public SellStock(Stock s){
        this.stock = s;
    }

    //functions
    @Override
    public void execute() {
        stock.sell();
    }
}
