public class productRabattDemo {
    public static void main(String[] args){
        //create products
        Produkt rasenmacher = new Produkt((preis) -> preis * 0.8);

        double neuerPreis = rasenmacher.rabattStrategie.berechneRabatt(10.10);
        System.out.println(neuerPreis);
    }
}
