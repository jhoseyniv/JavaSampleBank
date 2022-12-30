package javasamples.designpattern.Behavioral.Observer;

public class MyClientImp implements  MyClient<String> {

    private String  name;

    public MyClientImp(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void observeServer(String clientName,String serverEvent) {
        System.out.println("I am Observer "+ clientName + " and notified that : " + serverEvent);
    }
}




