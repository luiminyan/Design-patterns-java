import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DruckZentrum {
    private Queue<DruckCommand> wartenSchlange;
    public DruckZentrum(){
        this.wartenSchlange = new LinkedList<>();
    }
    public void druckeNaechste(){
        DruckCommand druckCommand = wartenSchlange.poll();
        druckCommand.drucken();
    }
    public void druckAnfordern(DruckCommand command){
        wartenSchlange.add(command);
    }
    public void druckAbbrechen(){

    }
}
