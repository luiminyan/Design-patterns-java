import java.io.File;

public class Document {
    private File file;
    public Document(File file) {
        this.file = file;
    }

    public void Open(){
        System.out.println(file.getName() + "is opened!");
    }

    public void Close(){
        System.out.println(file.getName() + "is closed!");
    }

    public String getFilePath(){
        return file.getPath();
    }
}
