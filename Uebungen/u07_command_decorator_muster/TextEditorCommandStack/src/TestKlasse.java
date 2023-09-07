public class TestKlasse {
    public static void main(String[] args){
        //create content / TextEditor
        TextEditor editor01 = new TextEditor("Hello world!");

        //create command
        EditorCommand appendText01 = new AppendTextCommand(editor01, " ... add some text 01");
        EditorCommand appendText02 = new AppendTextCommand(editor01, " ... add some text 02");
        EditorCommand appendText03 = new AppendTextCommand(editor01, " ... add some text 03");

        //create CommandManager
        CommandManager cmdManager01 = new CommandManager();

        //execute
        cmdManager01.executeCommand(appendText01);
        cmdManager01.executeCommand(appendText02);
        cmdManager01.executeCommand(appendText03);

        cmdManager01.undo();
    }
}
