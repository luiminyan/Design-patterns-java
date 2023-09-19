import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ProxyInternetConnection implements InternetConnection{
    private boolean useWhitelist;
    private NetworkInternetConnection internetConnection;
    private List<String> whiteList, blackList;

    public ProxyInternetConnection(boolean useWhitelist) {
        this.useWhitelist = useWhitelist;
        updateList();
//        create 'real' networkInternetConnection
        internetConnection = new NetworkInternetConnection();
    }
    @Override
    public void connectToHost(String host) {
        if (useWhitelist) {
//            use white list
            if (whiteList.isEmpty()) {
                System.out.println("Failed: whitelist is empty");
            }
            else if (whiteList.contains(host)) {
//              call real networkConnection
                internetConnection.connectToHost(host);
            }
            else {
                System.out.println(host + " ist not on whitelist");
            }

        }
        else {
//            use black list
            if (blackList.contains(host)) {
                System.out.println("Failed: " + host + " is on blacklist");
            }
            else {
                internetConnection.connectToHost(host);
            }
        }
    }

    public void updateList() {
        try {
            whiteList = Files.readAllLines(Paths.get("whitelist.txt"));
            blackList = Files.readAllLines(Paths.get("blacklist.txt"));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
