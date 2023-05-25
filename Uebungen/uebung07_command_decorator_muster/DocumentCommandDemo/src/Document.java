import java.io.File;
public class Document {
    //attributes
    private File file;

    //constructor
    public Document(){}

    public Document(File f){
        this.file = f;
    }


    //operations
    public void open(){
        //do the printing thing
        System.out.println("Document " + file.getName() + "is opened.");

    }
    public void close(){
        System.out.println("Document " + file.getName() + "is closed.");
    }

    public String getFilePath(){
        return file.getPath();
    }
}
