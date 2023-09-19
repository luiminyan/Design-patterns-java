// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        proxy pattern testing
        Beitrag beitrag01 = new Beitrag("Mimi is a getmalware.test piiiii","Mimi has a big poooo notavirus.invalid!!!");
        BeitragProxy proxy = new BeitragProxy(beitrag01);
        System.out.println(proxy.getNutzername());
        System.out.println(proxy.getInhalt());

//        adapter pattern testing
        Posting p1 = new Posting(new User("dhsahd@ds.com", "Mimipoopoo"), "HElllo this is my post!!");
//        create adapter
        Adapter adapter = new Adapter(p1);
        System.out.println(adapter.getNutzername());
        System.out.println(adapter.getInhalt());
    }
}