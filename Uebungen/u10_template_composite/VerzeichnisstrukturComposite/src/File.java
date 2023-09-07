public class File implements FileSystemComponent{
    private String name;
    private int size;

//    constructor
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //    implements function from interface FileSystemComponent
    @Override
    public void print() {
        System.out.println("File name: " + name + ", file size: " + size);
    }

    @Override
    public int getSize() {
        return size;
    }
}
