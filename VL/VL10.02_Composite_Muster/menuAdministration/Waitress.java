package menuAdministration;

public class Waitress {
    // attributes
    private MenuComponent allMenus;
    private String name;

    // constructor
    public Waitress(MenuComponent allMenus, String name) {
        this.allMenus = allMenus;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printAllMenus() {
        System.out.println(" \n" + getName());
        System.out.println("---------------------------");
        allMenus.print();
    }
}
