public class Test {
    public static void main(String[] args) {
        FileSystemComponent f01 = new File("Uebung01", 384);
        FileSystemComponent f02 = new File("Loesung01", 37);
        Directory dir01 = new Directory("uebung");
        dir01.add(f01);
        dir01.add(f02);
        System.out.println("Files in directory01:");
        dir01.print();
        System.out.println("Directory01 size: " + dir01.getSize() + "\n");

        Directory dir02 = new Directory("oom");
        FileSystemComponent file03 = new File("eclipseIDE", 578);
        dir02.add(dir01);
        dir02.add(file03);
        System.out.println("Files in directory02:");
        dir02.print();
        System.out.println("Directory02 size: " + dir02.getSize() + "\n");


    }
}
