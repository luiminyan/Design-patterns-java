public class ChicagoPizzaFactory extends AbstractPizzaFactory{
    //constructor, call super
    public ChicagoPizzaFactory(String slogan) {
        super(slogan);
    }

    //implement the abstract function in parent class
    @Override
    public Pizza orderPizza(PizzaType pizzaType, int... slice) {
        Pizza pizza = null;
        switch (pizzaType){
            case MEAT_PIZZA -> pizza = new MeatPizza();
            case CHEESE_PIZZA -> pizza = new CheesePizza();
            case PEPPERONI_PIZZA -> pizza = new PepperoniPizza();
            case MARGHERITA_PIZZA -> pizza = new MargheritaPizza();
        }
        preparePizza(pizza, slice);
        return pizza;
    }
}
