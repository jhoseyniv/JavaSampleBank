package javasamples.designpattern.Behavioral.Observer;

import java.util.HashSet;
import java.util.Set;

public class MyServerImp implements MyServer<String> {

    private String name;

    public MyServerImp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<MyClient<String>> getClientSet() {
        return clientSet;
    }

    public Set<MyClient<String>> clientSet = new HashSet<>();
    @Override
    public void registerClient(MyClient client) {
        clientSet.add(client);
    }

    @Override
    public void unRregisterClient(MyClient client) {
        clientSet.remove(client);
    }

    @Override
    public void notifyClients(String serverEvent) {
        clientSet.forEach(client -> client.observeServer(client.getName(),serverEvent));

    }


}
