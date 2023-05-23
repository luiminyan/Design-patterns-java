public class Admin implements ProductObserver{
    //attribute
    private Store store;    //the subject

    //constructor
    public Admin(Store store){
        this.store = store;
        store.registerObserver(this);
    }
    //implement function from interface
    @Override
    public void update() {
        System.out.println("\nAdmin checks the store...");
        store.printAllProducts();
    }
}
