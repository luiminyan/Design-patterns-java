import java.util.ArrayList;

public class Directory implements FileSystemComponent{
    private String name;
    private ArrayList<FileSystemComponent> directoryContent;

//    constructor
    public Directory(String name){
        this.name = name;
//        initialise contentList
        this.directoryContent = new ArrayList<>();
    }


// implement functions from interface
    @Override
    public void print() {
        for (FileSystemComponent component : directoryContent) {
//            call the print() of FileSystemComponent object (could be directory or file)
            component.print();
        }
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : directoryContent) {
            size += component.getSize();
        }
        return size;
    }

//    modify the component list
    public void add(FileSystemComponent component) {
        directoryContent.add(component);
    }

    public void remove(FileSystemComponent component) {
        directoryContent.remove(component);
    }
}
