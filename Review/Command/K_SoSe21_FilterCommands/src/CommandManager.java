import java.util.ArrayList;

public class CommandManager {
    private ArrayList<IFilter> filterCommands;
    public CommandManager(){
        this.filterCommands = new ArrayList<>();
    }
    public void executeThreeTimes(IFilter iFilter){
        System.out.println("Anwende 3 mal");
        for (int i = 0; i < 3; i++){
            filterCommands.add(iFilter);
            iFilter.anwenden();
        }
    }

    public void executeFiveTimes(IFilter iFilter){
        System.out.println("Anwende 5 mal");
        for (int i = 0; i < 5; i++){
            filterCommands.add(iFilter);
            iFilter.anwenden();
        }
    }
}
