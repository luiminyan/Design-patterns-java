import java.io.File;
public class Document {
    //attributes
    private File file;

    //constructor
    public Document(){}

    //add file by path
    public Document(String path){
        this.file = new File(path);
    }

    //add file
    public Document(File file){
        this.file = file;
    }

    //operations
    public void open(){
        //do the printing thing
        System.out.println("Document " + file.getName() + " is opened.");

    }
    public void close(){
        System.out.println("Document " + file.getName() + " is closed.");
    }

    public String getFilePath(){
        return file.toString();
    }
}
