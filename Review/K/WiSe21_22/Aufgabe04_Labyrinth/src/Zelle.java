public class Zelle {
    private int x;
    private int y;
    private Muster muster;
    protected boolean isStart, isEnd;

    public Zelle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Zelle(int x, int y, Muster muster) {
        this.x = x;
        this.y = y;
        this.muster = muster;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Muster getMuster() {
        return muster;
    }

    public void setMuster(Muster muster) {
        this.muster = muster;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
