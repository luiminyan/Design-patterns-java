import java.util.ArrayList;
import java.util.List;

public class StoreObserverDemo {
    public static void main(String[] args){
        //create product list
        List<Product> pList01 = new ArrayList<>();
        pList01.add(new Product(3, "Eier"));
        pList01.add(new Product(4, "Apfel"));
        pList01.add(new Product(2, "Banana"));
        pList01.add(new Product(17500, "Auto"));

        //create store / subject
        Store store01 = new Store(pList01);

        //create Admin
        ProductObserver admin = new Admin(store01);
        ProductObserver customer01 = new Customer(store01);
        ProductObserver customer02 = new Customer(store01);

        //store notify all customers
        store01.notifyAllObservers();
    }
}
