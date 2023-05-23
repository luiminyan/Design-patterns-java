public class Product {
    //attributes
    private double price;
    private String name;

    //constructor
    public Product(double price, String name){
        this.price = price;
        this.name = name;
    }

    //getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
