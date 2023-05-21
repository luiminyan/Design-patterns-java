public class IterarorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository01 = new NameRepository();

        for(Iterator iter = nameRepository01.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name : " + name);

        }
    }
}
