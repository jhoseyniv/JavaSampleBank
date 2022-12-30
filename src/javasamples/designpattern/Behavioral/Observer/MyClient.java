package javasamples.designpattern.Behavioral.Observer;

public interface MyClient<T> {
public void observeServer(T client,T serverEvent);
public  T getName();

}
