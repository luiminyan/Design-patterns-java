public class TextEditor {
    private String text;
    public TextEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void andereText(String text){
        this.text = text;
        System.out.println(this.text);
    }
}
