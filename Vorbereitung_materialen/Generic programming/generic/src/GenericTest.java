import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args){
        //System.out.println("Hello World!");

        //objects of class GenericCustom
        GenericCustom genericCustom1 = new GenericCustom();
        GenericCustom<String, Double, Long> genericCustom2 = new GenericCustom<>();

        //objects of GenericImp classes implementing GenericInterface
        GenericImp1 genericImp1 = new GenericImp1();
        GenericImp2<String, Double, Long> genericImp2 = new GenericImp2<>();

        //object of GenericMethods
        GenericMethods genericMethods = new GenericMethods();
        System.out.println(genericMethods.genMethod2("Hello"));


        //
        Feeder feeder1 = new Feeder();

        List<Animal> animalList1 = new ArrayList<>();
        animalList1.add(new Dog());
        animalList1.add(new Dog());
        feeder1.feed(animalList1);







    }
}
