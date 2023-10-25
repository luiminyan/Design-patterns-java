public class Pizza {
    protected String name;
    public Pizza(String name){
        this.name = name;
    }

    protected void bake() {
        System.out.println(name + " is baked");
    }

    protected void cut(int slice){
        System.out.println(name + " is cut into " + slice + " slices!");
    }

    protected void box(String slogan) {
        System.out.println(name + " is put into box with slogan " + slogan);
    }

}
