import java.util.Iterator;

public class NameIterator implements Iterator<String> {
    //connect NameRepository / aggregate
    private NameRepository nameRepository;
    private int index = 0;

    //constructor
    public NameIterator(NameRepository nameRepository){
        this.nameRepository = nameRepository;
    }


    @Override
    public boolean hasNext() {
        return (index < nameRepository.getNameList().size());
    }

    @Override
    public String next() {
        String str = nameRepository.getNameList().get(index);
        index ++;
        return str;
    }
}
