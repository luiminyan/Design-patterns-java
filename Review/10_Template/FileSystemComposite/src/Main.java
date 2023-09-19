public class Main {
    public static  void main(String[] args) {
        Directory dir01 = new Directory("Dir01");
        dir01.addComponent(new File("milan.txt", 15));
        dir01.addComponent(new File("pupi.txt", 5));
        dir01.addComponent(new File("pooopooo.txt", 4));
        dir01.print();
        System.out.println(dir01.getSize());
    }
}