package menuAdministration;

import java.util.ArrayList;

public class Menu implements MenuComponent {
    // attributes
    private String name;
    private String description;
    // array to store menuComponents
    private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    // constructor
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
       System.out.println("\n" + getName());
       System.out.println(", " + getDescription());
       System.out.println("-----------------------------");
       for (MenuComponent menuComp : menuComponents) {
            menuComp.print();
       }
    }

    @Override
    public void add(MenuComponent comp) {
        menuComponents.add(comp);
    }

    @Override
    public void remove(MenuComponent comp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    
    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

    @Override
    public boolean isVegetarian() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isVegetarian'");
    }


}
