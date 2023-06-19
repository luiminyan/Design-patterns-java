public class Main {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory01 = new SimplePizzaFactory("We love pizza!");
        PizzaStore pizzaStore = new PizzaStore("Store01", simplePizzaFactory01);

        Pizza pizza01 = pizzaStore.orderCheesePizza(4);
        Pizza pizza02 = pizzaStore.orderMargheritaPizza(0);
        Pizza pizza03 = pizzaStore.orderPepperoniPizza(2);
        Pizza pizza04 = pizzaStore.orderSurprisePizza();
    }
}
