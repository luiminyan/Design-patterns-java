public class VirtualDruckCommand {
    private String datei;
    private String output;
    private VirtualDrucker virtualDrucker;
    public VirtualDruckCommand(String datei, String output, VirtualDrucker virtualDrucker){
        this.datei = datei;
        this.output = output;
        this.virtualDrucker = virtualDrucker;
    }
    public void drucken() {
        virtualDrucker.drucken(datei, output);
    }
}
