import java.util.ArrayList;

public class Directory implements FileSystemComponent{
    private ArrayList<FileSystemComponent> componentList;
    private String name;
    public Directory(String name) {
        this.name = name;
        this.componentList = new ArrayList<>();
    }

    @Override
    public void print() {
        for (FileSystemComponent component : componentList) {
            component.print();
        }
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : componentList) {
            size += component.getSize();
        }
        return size;
    }

//    componentList operations
    public void addComponent(FileSystemComponent component) {
        componentList.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        componentList.remove(component);
    }
}
