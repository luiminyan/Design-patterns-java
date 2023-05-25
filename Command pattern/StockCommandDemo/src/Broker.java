import java.util.ArrayList;

public class Broker {
    //execute class
    private ArrayList<Order> orderList = new ArrayList<>();

    //constructor
    public Broker(){}

    //functions
    public void takeOrder(Order o){
        orderList.add(o);
    }

    public void placeOrders(){
        for (Order o:orderList) {
            o.execute();
        }
        orderList.clear();
    }

}
