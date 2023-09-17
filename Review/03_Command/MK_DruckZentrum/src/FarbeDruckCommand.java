public class FarbeDruckCommand implements DruckCommand{
    private String datei;
    private boolean beidseitig;
    private Farbedrucker farbedrucker;
    public FarbeDruckCommand(Farbedrucker drucker, String datei, boolean beidseitig){
        this.datei = datei;
        this.farbedrucker = drucker;
        this.beidseitig = beidseitig;
        this.farbedrucker.setBeidseitig(beidseitig);
    }
    public void drucken(){
        farbedrucker.drucken(datei);
    }
}
