public class PizzaStoreTest {
    public static void main(String[] args) {
        AbstractPizzaFactory nyFactory = new NYPizzaFactory("New york pizza!");
        AbstractPizzaFactory chicagoFactory = new ChicagoPizzaFactory("Chicago pizza");
        PizzaStore store01 = new PizzaStore("NYstore01", nyFactory);
        PizzaStore store02 = new PizzaStore("NYstore02", nyFactory);
        PizzaStore store03 = new PizzaStore("ChicagoStore01", chicagoFactory);

        Pizza pizza1 = store01.orderPizza(PizzaType.MARGHERITA_PIZZA, 6);
        store02.orderPizza(PizzaType.PEPPERONI_PIZZA);
        store03.orderPizza(PizzaType.MEAT_PIZZA, 12);
        //System.out.println("Pizza 1: " + pizza1);


    }
}
