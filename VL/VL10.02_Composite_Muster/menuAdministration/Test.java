package menuAdministration;

public class Test {
    public static void main(String[] args){
        Menu menu01 = new Menu("all menus", "The whole menu!\n")
        Waitress waitress01 = new Waitress(menu01, "Lisa");

        waitress01.printAllMenus();
    }
}
