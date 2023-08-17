package menuAdministration;

public interface MenuComponent {
    public String getName();
    public String getDescription();
    public double getPrice();
    public boolean isVegetarian();
    public void print();

    public void add(MenuComponent comp);
    public void remove(MenuComponent comp);
    public MenuComponent getChild(int i);
}
