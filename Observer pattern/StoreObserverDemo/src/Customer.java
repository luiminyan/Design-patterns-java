import java.util.Random;

public class Customer implements ProductObserver{
    //attribute
    private Store store;    //the subject
    private String id;

    //constructor
    public Customer(Store store){
        this.store = store;
        this.id = "C" + new Random().nextInt(100000);   //generate random client id
        store.registerObserver(this);
    }
    //implement function from interface
    @Override
    public void update() {
        System.out.println("\nCustomer " + id + " checks the store...");
        store.printAllProducts();
    }
}
