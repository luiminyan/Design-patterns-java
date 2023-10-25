public class PizzaFactory {
    private String slogan;
    public PizzaFactory(String slogan) {
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Pizza orderCheesePizza() {
        Pizza pizza = new CheesePizza();
        preparePizza(pizza);
        return pizza;
    }

    private void preparePizza(Pizza pizza){
        pizza.bake();
        pizza.cut(8);
        pizza.box(this.slogan);
    }
}
