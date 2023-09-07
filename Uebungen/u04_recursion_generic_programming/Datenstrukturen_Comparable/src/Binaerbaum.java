public class Binaerbaum<T extends Comparable<T>>{
    private Knote<T> wuerzel;

//    constructor
    public Binaerbaum(){
//        init. the wuerzel attribute
        this.wuerzel = null;
    }

//    hinzufuegen
    public void hinzufuegen(T addObj){
//        if wurzel not existing
        if (this.wuerzel == null) {
            this.wuerzel = new Knote<T>(addObj);
        }
        else {
            wuerzel.hinzifuegenRekursiv(addObj);
        }
    }

//    finden
    public T finden(T findObj){
        if (wuerzel == null) {
            return null;
        }
        else {
            return wuerzel.findRekursiv(findObj);
        }
    }
}
