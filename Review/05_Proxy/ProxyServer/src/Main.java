public class Main {
    public static void main(String[] args) {
//      client interact with InternetConnection  / Proxy
        InternetConnection proxyInternetConnection = new ProxyInternetConnection(true);
        proxyInternetConnection.connectToHost("rub.de");
        proxyInternetConnection.connectToHost("google.com");
    }
}