public class NYPizzaFactory extends AbstractPizzaFactory{
    //constructor, call super
    public NYPizzaFactory(String slogan) {
        super(slogan);
    }

    //implement the abstract function in parent class
    @Override
    public Pizza orderPizza(PizzaType pizzaType, int... slice) {
        Pizza pizza = null;
        switch (pizzaType){
            case CHEESE_PIZZA -> pizza = new CheesePizza();
            case VEGGIE_PIZZA -> pizza = new VeggiePizza();
            case PEPPERONI_PIZZA -> pizza = new PepperoniPizza();
            case MARGHERITA_PIZZA -> pizza = new MargheritaPizza();
        }
        preparePizza(pizza, slice);
        return pizza;
    }
}
