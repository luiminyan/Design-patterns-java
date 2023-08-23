public class ArbeitenMitArrays {
    public static void main(String[] args){
        String[] x = new String[4];         //need to define the size
        x[0] = "a";
        x[1] = "b";
        x[2] = "c";

        x[2] = "d";
        x[1] = null;

        for(int i = 0; i < x.length; i++){      //string / array size x.length
            System.out.println(i);
        }

        String suchtext = "d";
        int nr = -1;
        for (int i = 0; i < x.length; i++){
            if (suchtext.equals(x[i])){
                nr = i;
            }
        }
        System.out.println("Position von " + suchtext + ": " + nr);
    }
}
