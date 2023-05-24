public class Abonnent implements IAbonnent{
    //attribute
    private String name;

    //constructor
    public Abonnent(String name){
        this.name = name;
    }

    //implement function from interface
    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        //print information
        System.out.println(name + " hat die Zeitung " + zeitung.getTitel()+ " am " +zeitung.getDatum()+ " erhalten.");
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
