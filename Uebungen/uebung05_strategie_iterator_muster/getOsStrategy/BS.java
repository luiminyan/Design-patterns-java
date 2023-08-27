package getOsStrategy;

public class BS {
    private Strategie strategie;

    // constructor

    String os = System.getProperty("os.name");
    
    boolean isWin = os.startsWith("Windows");
    boolean isLinux = os.startsWith("Linux");
    boolean isMac = os.startsWith("Mac");

    
}






















