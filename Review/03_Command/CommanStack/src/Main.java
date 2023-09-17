public class Main {
    public static void main(String[] args) {

//        create CommandManager
        CommandManager commandManager = new CommandManager();
//        create TextEditor (the event executer)
        TextEditor textEditor = new TextEditor("Hello World!");
        AppendTextCommand appendTextCommand01 = new AppendTextCommand(textEditor, "Modified text");
        commandManager.execute(appendTextCommand01);
        commandManager.undo();
    }
}