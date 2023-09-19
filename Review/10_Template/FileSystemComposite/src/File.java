public class File implements FileSystemComponent{
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("Filename: " + name + ", Size: " + size);
    }

    @Override
    public int getSize() {
        return size;
    }
}
