public class FactoryTest {
    public static void main(String[] args){
        System.out.println("\tRÜCKSEITE\t \tVORDERSEITE\n");
        AbstractTrikotFactory trikotFactory01 = new GERTrikotFactory();
        AbstractTrikotFactory trikotFactory02 = new PORTrikotFactory();
        trikotFactory01.erstelleTrikot("KLOSE", 11);
        trikotFactory02.erstelleTrikot("RONALDO", 7);
    }
}
