public class CheesePizza extends Pizza{
    //constructor
    protected CheesePizza(String n) {
        super(n);
    }

    //imple. func.s
    @Override
    protected void bake() {
        super.bake();
    }

    @Override
    protected void cut(int slices) {
        super.cut(slices);
    }

    @Override
    protected void box(String slogan) {
        super.box(slogan);
    }

    //getters and setters
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
