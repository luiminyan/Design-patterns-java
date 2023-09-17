public class Parser {
    private Scanner scanner;
    public void parse(String sourceFile){
        this.scanner = new Scanner();
        this.scanner.scan(sourceFile);
        System.out.println(sourceFile + " ist geparst");
    }
}
