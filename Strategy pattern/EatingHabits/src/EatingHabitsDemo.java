public class EatingHabitsDemo {
    public static void main(String[] args){
        //create human
        Human chinese01 = new Chinese();
        Human american01 = new American();

        //let them eat
        chinese01.eat();
        american01.eat();
    }
}
