package javasamples.designpattern.Behavioral.Observer;

public interface MyServer<T> {
    public void registerClient(MyClient<T> client);
    public void unRregisterClient(MyClient<T> client);
    public void notifyClients(T serverEvent);

}
