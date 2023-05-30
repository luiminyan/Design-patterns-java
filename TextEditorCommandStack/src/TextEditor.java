//the content
public class TextEditor {
    //attributes
    private String text;
    //constructor
    public TextEditor(String text){
        this.text = text;
    }

    //functions
    //getter
    public String getText(){
        return text;
    }

    //setters for text
    public void aendereText(String text){
        this.text = text;
        //print out neuer Text
        System.out.println(this.text);
    }
}
