public class Farbedrucker {
    private boolean isBeideseitig;
    public void setBeidseitig(boolean b) {
        this.isBeideseitig = b;
    }
    public void drucken(String datei){
        System.out.println(datei + " ist ausgedruckt, ist beideseitig: " + isBeideseitig);
    }
}
