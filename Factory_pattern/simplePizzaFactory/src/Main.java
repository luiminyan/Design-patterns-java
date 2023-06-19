public class Main {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory01 = new SimplePizzaFactory("We love pizza!");
        PizzaStore pizzaStore = new PizzaStore("Store01", simplePizzaFactory01);

        Pizza pizza01 = simplePizzaFactory01.orderCheesePizza(4);
        Pizza pizza02 = simplePizzaFactory01.orderMargheritaPizza(0);
        Pizza pizza03 = simplePizzaFactory01.orderPepperoniPizza(2);
        Pizza pizza04 = simplePizzaFactory01.orderSurprisePizza();
    }
}
