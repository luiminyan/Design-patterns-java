public class BSTest {
    public static void main(String[] args){
        Linuxstrategie linuxstrategie = new Linuxstrategie();
        Betriebssystem betriebssystem01 = new Betriebssystem(linuxstrategie);
        Betriebssystem betriebssystem02 = new Betriebssystem(new Macstrategy());
        Betriebssystem betriebssystem03 = new Betriebssystem(new Windowsstrategie());
        System.out.println(betriebssystem01.getOS());
        System.out.println(betriebssystem02.getOS());
        System.out.println(betriebssystem03.getOS());
    }
}
