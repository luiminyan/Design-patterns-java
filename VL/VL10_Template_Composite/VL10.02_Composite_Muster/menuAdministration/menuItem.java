package menuAdministration;

public class menuItem implements MenuComponent{
    // attributes
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    // constructor
    public menuItem(String name, String description,  double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    // getters & setters
    public String getName () {
        return name;
    }

    public String getDescription () {
        return description;
    }

    public double getPrice () {
        return price;
    }

    public boolean isVegetarian () {
        return vegetarian;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("  -- " + getDescription());
    }

    @Override
    public void add(MenuComponent comp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(MenuComponent comp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public MenuComponent getChild(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChild'");
    }
}
