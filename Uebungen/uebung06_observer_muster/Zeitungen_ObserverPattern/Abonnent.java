public class Abonnent implements IAbonnent{
    private String name;

    // constructor
    public Abonnent(String name) {
        this.name = name;
    } 
    
    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println(this.name + " hat die Zeitung " + zeitung.getTitel() + " am " + zeitung.getDatum() + " erhalten.");
        
    }
}
