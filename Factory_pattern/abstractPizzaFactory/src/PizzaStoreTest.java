public class PizzaStoreTest {
    public static void main(String[] args) {
        AbstractPizzaFactory nyFactory = new NYPizzaFactory("New york pizza!");
        AbstractPizzaFactory chicagoFactory = new ChicagoPizzaFactory("Chicago pizza");
        PizzaStore store01 = new PizzaStore("NYstore01", nyFactory);
        PizzaStore store02 = new PizzaStore("NYstore02", nyFactory);
        PizzaStore store03 = new PizzaStore("ChicagoStore01", chicagoFactory);

        store01.orderPizza(PizzaType.MARGHERITA_PIZZA, 6);
        store02.orderPizza(PizzaType.PEPPERONI_PIZZA);
        store03.orderPizza(PizzaType.MEAT_PIZZA, 12);


    }
}
