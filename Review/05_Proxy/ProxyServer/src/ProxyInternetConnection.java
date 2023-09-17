public class ProxyInternetConnection implements InternetConnection{
    private boolean useWhitelist;
    public ProxyInternetConnection(boolean useWhitelist) {
        this.useWhitelist = useWhitelist;
    }
    @Override
    public void connectToHost(String host) {

    }
}
