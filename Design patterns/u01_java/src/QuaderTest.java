public class QuaderTest {
    public static void main(String[] args){
//        Task: 1.6.2
        Quader q1 = new Quader(10, 5, 4);
        
//        Task: 1.6.3
        Quader q2 = new Quader(5,5,5);
        System.out.println(q2.getBreite() * q2.getHoehe() * q2.getLaenge());
        q2.calcVolumen();
    }

}
