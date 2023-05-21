public class NameRepository implements Iterable{
    private String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    public NameRepository(){

    }

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }

    public String[] getNames(){
        return names;
    }

}
