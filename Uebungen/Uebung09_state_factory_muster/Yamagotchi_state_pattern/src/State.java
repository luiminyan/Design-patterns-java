public interface State {
    public void fuettern(HundMaschine maschine);
    public void spielen(HundMaschine maschine);
    public void nix_tun(HundMaschine maschine);
    public void tranieren(HundMaschine maschine);

    public void step(HundMaschine maschine);
    public void entry(HundMaschine maschine);
    public void exit(HundMaschine maschine);
}
