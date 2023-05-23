import java.util.ArrayList;
import java.util.List;

public class Store {
    //attributes
    private List<ProductObserver> observerList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();

    //constructors
    public Store(){}
    public Store(List<Product> productList){
        this.productList = productList;
    }

    //notify all observers
    public void notifyAllObservers(){
        for (ProductObserver observer:observerList) {
            observer.update();
        }
    }

    //register new observer
    public void registerObserver(ProductObserver observer){
        observerList.add(observer);
    }

    //getters and setters
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //add product
    public void addProduct(Product product){
        this.productList.add(product);
    }

    //print all product in store
    public void printAllProducts(){
        for (Product p: productList) {
            System.out.println("Name: " + p.getName() + " \tprice: " + p.getPrice());
        }
    }
}
