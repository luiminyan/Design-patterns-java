public class GenericCustom<A, B, C> {
    private A a;
    private B b;
    private C c;

    GenericCustom(){}
    GenericCustom(A a, B b, C c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A method1(A a){
        return a;
    }

}
