public class NetworkInternetConnection implements InternetConnection{
    @Override
    public void connectToHost(String host) {
        System.out.println("Connected to host: " + host);
    }
}
