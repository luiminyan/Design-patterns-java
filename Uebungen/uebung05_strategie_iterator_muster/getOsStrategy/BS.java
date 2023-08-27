package getOsStrategy;

public class BS {
    private Strategie strategie;

    // constructor
    public BS() {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            strategie = new Windowsstrategie();
        }
        else if (os.startsWith("Linux")) {
            strategie = new Linuxstrategie();
        }
        else if (os.startsWith("Mac")) {
            strategie = new MacStrategy();
        }
        else {
            strategie = null;
            System.out.println("Betriebssystem is nicht bekannt");
        }
    }

    //getOS
    public String getOS() {
        return strategie.getOS();
    }
}






















