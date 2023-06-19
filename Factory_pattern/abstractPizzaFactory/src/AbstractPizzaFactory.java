public abstract class AbstractPizzaFactory {
    //attributes
    private String slogan;

    //constructor
    public AbstractPizzaFactory(String slogan) {
        this.slogan = slogan;
    }

    //getters and setters
    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    //abstract functions
    public abstract Pizza orderPizza(PizzaType pizzaType, int... slice);

    //private 和 abstract 不能同时存在
    protected void preparePizza(Pizza pizza, int ... slice){
        pizza.bake();
        //如果用户输入了slice参数
        if (slice.length > 0){
            pizza.cut(slice[0]);
        }
        //默认pizza切8片
        else pizza.cut(8);
        pizza.box(slogan);
        System.out.println(pizza.getName() + " is ready.\n");
    }
}
