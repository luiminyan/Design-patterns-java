public abstract class Pizza {
    //attributes
    protected String name;

    //constructor, protected -> can only be called inside the package
    protected Pizza(String n){
        this.name = n;
    }

    //functions
    protected void bake(){
        System.out.println(name + " is baked.");
    }

    protected void cut(int slices){
        System.out.println(name + " is cut into " + slices + " slices.");
    }

    protected void box(String slogan){
        System.out.println(name + " is packed into box with slogan " + slogan);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
