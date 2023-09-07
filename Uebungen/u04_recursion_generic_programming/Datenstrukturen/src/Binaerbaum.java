public class Binaerbaum {
    private Knote wuerzel;

//    constructor
    public Binaerbaum(){
//        init. the wuerzel attribute
        this.wuerzel = null;
    }

//    hinzufuegen
    public void hinzufuegen(Person p){
//        if wurzel not existing
        if (this.wuerzel == null) {
            this.wuerzel = new Knote(p);
            System.out.println(p.getId());
        }
        else {
            wuerzel.hinzifuegenRekursiv(p);
            System.out.println(p.getId());
        }
    }

//    finden
    public Person finden(int id){
        if (this.wuerzel == null) {
            return null;
        }
        else {
            return this.wuerzel.findRekursiv(id);
        }
    }

//    get wurzel
    public Knote getWuerzel() {
        return wuerzel;
    }
}
