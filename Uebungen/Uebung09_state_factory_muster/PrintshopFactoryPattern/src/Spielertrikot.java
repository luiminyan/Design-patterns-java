public class Spielertrikot implements Trikot{
    //attributes
    private String front;
    private String back;
    private String color1;
    private String color2;

    //setters
    public void setFront(String name, int nummer, String land) {
        front = "------" + "_".repeat(name.length()) + "------\n"  +
                "|- " + name + " -|\t |- # ----- # -|\n" +
                "---| " + String.format("%" + 7 + "s", "") + " |---\n" +
                "|" + String.format("%" + 3 + "s", "") + nummer + String.format("%" + 3 + "s", "") + "|\t\n" +
                "|" + String.format("%" + 7 + "s", "") + "|\n" +
                "|" + String.format("%" + 2 + "s", "") + land + String.format("%" + 2 + "s", "") +"|" +
                "|-------|" ;
    }

    public void setBack(String name, int nummer) {
        back = "------" + "_".repeat(name.length()) + "------\n" +
                "|- # ----- # -|\n" +
                "\t ---| |---\n" +
                "||\n" +
                "|||" + nummer + "|\n" +
                "|" + String.format("%" + 7 + "s", "") + "|\n" +
                "|-------|";
    }

    //implement functions
    @Override
    public void drucke() {
        //print front
        System.out.println(front);
        //print back
        System.out.println(back);
    }
}
