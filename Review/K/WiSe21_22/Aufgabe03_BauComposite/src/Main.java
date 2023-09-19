// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BauteilGruppe bauteilGruppe = new BauteilGruppe("BT1Group");
        BauwerkKomponente bauTeil01 = new Bauteil("Pillar_BT1");
        bauteilGruppe.add(bauTeil01);
        BauwerkKomponente bauTeil02 = new Bauteil("Wall01");
        bauteilGruppe.add(bauTeil02);

        bauteilGruppe.filterBauwerk("BT1");
    }
}