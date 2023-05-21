import java.util.ArrayList;

public class ArbeitenMitArrayList {
    public static void main(String[] args){
        ArrayList<String> x = new ArrayList<String>();  //ArrayList, no need to define size
        x.add("a");
        x.add("b");
        x.add("c");

        //set / rewrite element 2 into d
        x.set(2,"d");

        //remove element
        x.remove(1);

        //ArrayList length: x.size()
        for (int i = 0; i < x.size(); i++){
            System.out.println(x.get(i));       //get element in ArrayList = x.get(index)
        }

        String suchtext = "d";
        System.out.println("Die Position von " + suchtext + " is " + x.indexOf(suchtext));  //x.indexOf(element), returns position of the ArrayList


    }
}
