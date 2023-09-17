public class AppendTextCommand implements EditorCommand{
    private TextEditor textEditor;
    private String altText;
    private String textToAppend;
    public AppendTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.altText = textEditor.getText();
        this.textToAppend = text;
    }

    @Override
    public void execute() {
        altText = textEditor.getText();
        textEditor.andereText(altText + " " + textToAppend);
    }

    @Override
    public void undo() {
        textEditor.andereText(altText);
    }
}
