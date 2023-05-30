import java.util.Stack;

public class CommandManager {
    //attribute for the content
    private Stack<EditorCommand> undoItems = new Stack<EditorCommand>();

    //functions (same as in the command interface / classes, in order to)
    public void executeCommand(EditorCommand cmd){
        //push into command stack
        undoItems.push(cmd);
        //execute the command
        cmd.execute();
    }

    public void undo(){
        //pop from command stack
        EditorCommand cmd = undoItems.pop();
        //undo the command
        cmd.undo();
    }

}
