public class AppendTextCommand implements EditorCommand{
    //attributes
    private String textAlt;
    private String textToAppend;
    private TextEditor textEditor;

    //constructor
    public AppendTextCommand(TextEditor editor, String text){
        //store the old value of editor into textAlt
        this.textAlt = editor.getText();
        //store the to-be changed value into textToAppend
        this.textToAppend = text;
        this.textEditor = editor;
    }

    //implement the methods from interface 'EditorCommand'
    @Override
    public void execute() {
        //update the textAlt
        textAlt = textEditor.getText();
        //do the change (append text)
        this.textEditor.aendereText(textAlt + textToAppend);
    }

    @Override
    public void undo() {
        this.textEditor.aendereText(textAlt);
    }
}
