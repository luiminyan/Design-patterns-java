import com.sun.jdi.Value;

public class Knote <E extends Comparable<E>>{
    private E value;
    private Knote<E> linksKnote, rechtsKnote;

//    constructor
    public Knote(E value){
        this.value = value;
    }

//    add recursively
    public void hinzifuegenRekursiv(E toCompValue) {
        if (this.value.compareTo(toCompValue) < 0) {
//            no left child
            if (this.linksKnote == null) {
                Knote<E> newKnote = new Knote(toCompValue);
                linksKnote = newKnote;
            }
            else {
//                linksKnote als Wuezel
                linksKnote.hinzifuegenRekursiv(toCompValue);
            }
        }
        else {
//            no right child
            if (this.rechtsKnote == null) {
                Knote newKnote = new Knote(toCompValue);
                this.rechtsKnote = newKnote;
            }
            else {
//                rechtsKnote als Wuezel
                rechtsKnote.hinzifuegenRekursiv(toCompValue);
            }
        }
    }

//    find recursively
    public E findRekursiv(E findObj) {
        if (this.value.compareTo(findObj) == 0) {
            return this.value;
        }

        else if (this.value.compareTo(findObj) < 0) {
//            search current node left child
            if (linksKnote != null) {
                return linksKnote.findRekursiv(findObj);
            }
            else return null;
        }
//        search right child
        else {
            if (rechtsKnote != null) {
                return linksKnote.findRekursiv(findObj);
            }
            else return null;
        }
    }
}
