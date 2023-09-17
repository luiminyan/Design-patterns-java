import java.util.Stack;

public class CommandManager {
    private Stack<EditorCommand> undoList;
    public CommandManager() {
        this.undoList = new Stack<>();
    }
    public void execute(EditorCommand command) {
        undoList.push(command);
        command.execute();
    }
    public void undo(){
        EditorCommand command = undoList.pop();
        command.undo();
    }
}
