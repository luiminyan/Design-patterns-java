public class Menuoptionen {
    private ActionListenerCommand actionOpen;
    private ActionListenerCommand actionClose;
    public Menuoptionen(ActionListenerCommand actionOpen, ActionListenerCommand actionClose){
        this.actionOpen = actionOpen;
        this.actionClose = actionClose;
    }

    public void clickOpen() {
        actionOpen.execute();
    }

    public void clickClose(Document document) {
        actionClose.execute();
    }
}
