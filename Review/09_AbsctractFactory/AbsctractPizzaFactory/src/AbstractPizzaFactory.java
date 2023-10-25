public abstract class AbstractPizzaFactory {
    protected String slogan;
    protected String location;
    public AbstractPizzaFactory(String slogan, String location) {
        this.slogan = slogan;
        this.location = location;
    }

    public Pizza createPizza() {
        return new Pizza();
    }

    public Baguette createBaguette(){
        return new Baguette();
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
