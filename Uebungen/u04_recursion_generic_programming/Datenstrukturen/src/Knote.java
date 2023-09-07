public class Knote {
    private Person person;
    private Knote linksKnote;
    private Knote rechtsKnote;

//    constructor
    public Knote(Person person){
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }
//    add recursively
    public void hinzifuegenRekursiv(Person p) {
        if (p.getId() <= this.person.getId()) {
//            no left child
            if (this.linksKnote == null) {
                Knote newKnote = new Knote(p);
                linksKnote = newKnote;
            }
            else {
//                linksKnote als Wuezel
                linksKnote.hinzifuegenRekursiv(p);
            }
        }
        else {
//            no right child
            if (this.rechtsKnote == null) {
                Knote newKnote = new Knote(p);
                this.rechtsKnote = newKnote;
            }
            else {
//                rechtsKnote als Wuezel
                rechtsKnote.hinzifuegenRekursiv(p);
            }
        }
    }

//    find recursively
    public Person findRekursiv(int id) {
        if (this.person.getId() == id) {
            return this.person;
        }
//        current node > to find node
        else if (this.person.getId() > id) {
//            search current node left child
            return this.linksKnote.findRekursiv(id);
        }
//        search right child
        else return this.rechtsKnote.findRekursiv(id);
    }
}
