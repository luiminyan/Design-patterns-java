import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimplePizzaFactory {
    //attributes
    private String slogan;

    //constructor
    public SimplePizzaFactory(String slogan) {
        this.slogan = slogan;
    }

    //getters and setters
    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    //functions
    public Pizza orderCheesePizza(int... slice){
        Pizza cheesePizza = new CheesePizza("Cheese pizza");
        System.out.println(cheesePizza.getName() + " is ordered.\n");
        preparePizza(cheesePizza, slice);
        return cheesePizza;
    }

    public Pizza orderMargheritaPizza(int... slice){
        Pizza margheritaPizza = new CheesePizza("Margherita pizza");
        System.out.println(margheritaPizza.getName() + " is ordered.\n");
        preparePizza(margheritaPizza, slice);
        return margheritaPizza;
    }

    public Pizza orderPepperoniPizza(int... slice){
        Pizza pepperoniPizza = new PepperoniPizza("Pepperoni pizza");
        System.out.println(pepperoniPizza.getName() + " is ordered.\n");
        preparePizza(pepperoniPizza, slice);
        return pepperoniPizza;
    }

    public Pizza orderSurprisePizza(){
        Random r = new Random();
        List<Pizza> pizzaList = new ArrayList<>(){
            //内部匿名类
            {
                add(new PepperoniPizza("Pepperoni pizza"));
                add(new CheesePizza("Margherita pizza"));
                add(new PepperoniPizza("Pepperoni pizza"));
            }
        };
        Pizza pizza = pizzaList.get(r.nextInt(pizzaList.size() - 1));
        System.out.println("Random pizza is ordered.\n");
        preparePizza(pizza);
        return pizza;
    }

    private void preparePizza(Pizza pizza, int ... slice){
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
