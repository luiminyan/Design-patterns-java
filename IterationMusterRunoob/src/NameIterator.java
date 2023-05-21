public class NameIterator implements Iterator{
    private int index = 0;
    private NameRepository nameRepository;

    @Override
    public boolean hasNext() {
        if (index < nameRepository.getNames().length){
            return true;
        }
        else return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()){
            return nameRepository.getNames()[index++];
        }
        else return null;
    }
}
