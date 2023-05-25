public class Stock {
    //request class
    //attributes
    private String name;
    private int quantity;

    //constructor
    public Stock(){}

    public Stock(String n, int q){
        this.name = n;
        this.quantity = q;
    }

    //functions
    public void buy(){
        //in request class, only print out
        System.out.println("Stock " + name + " is bought.");
    }

    public void sell(){
        System.out.println("Stock " + name + " is sold.");

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
