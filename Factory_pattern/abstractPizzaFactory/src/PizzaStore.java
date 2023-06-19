public class PizzaStore{
    //attributes
    private String storeName;
    private AbstractPizzaFactory abstractPizzaFactory;

    //constructor
    public PizzaStore(String storeName, AbstractPizzaFactory abstractPizzaFactory){
        this.storeName = storeName;
        this.abstractPizzaFactory = abstractPizzaFactory;
    }

    //getters and setter
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public AbstractPizzaFactory getAbstractPizzaFactory() {
        return abstractPizzaFactory;
    }

    public void setAbstractPizzaFactory(AbstractPizzaFactory abstractPizzaFactory) {
        this.abstractPizzaFactory = abstractPizzaFactory;
    }

    public Pizza orderPizza(PizzaType type, int... slice){
        return abstractPizzaFactory.orderPizza(type, slice);
    }


}
