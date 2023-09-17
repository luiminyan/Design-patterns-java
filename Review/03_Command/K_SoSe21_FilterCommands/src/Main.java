public class Main {
    public static void main(String[] args) {
        RauschenFilter rauschenFilter = new RauschenFilter(new Bild());
        WeichzeichnenFilter weichzeichnenFilter = new WeichzeichnenFilter(new Bild());
        CommandManager commandManager = new CommandManager();
        commandManager.executeFiveTimes(rauschenFilter);
        commandManager.executeThreeTimes(weichzeichnenFilter);
    }
}