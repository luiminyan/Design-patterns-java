public class PizzaStore {
    //attributes
    private String storeName;
    private SimplePizzaFactory simplePizzaFactory;

    //constructor
    public PizzaStore(String storeName, SimplePizzaFactory simplePizzaFactory){
        this.storeName = storeName;
        this.simplePizzaFactory = simplePizzaFactory;
    }

    //getters and setter
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public SimplePizzaFactory getSimplePizzaFactory() {
        return simplePizzaFactory;
    }

    public void setsImplePizzaFactory(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    //functions from SimplePizzaFactory
    public Pizza orderCheesePizza(int... slice){
        return simplePizzaFactory.orderCheesePizza(slice);
    }
    public Pizza orderMargheritaPizza(int... slice){
        return simplePizzaFactory.orderMargheritaPizza(slice);
    }
    public Pizza orderPepperoniPizza(int... slice){
        return simplePizzaFactory.orderPepperoniPizza(slice);
    }public Pizza orderSurprisePizza(int... slice){
        return simplePizzaFactory.orderSurprisePizza(slice);
    }

}
