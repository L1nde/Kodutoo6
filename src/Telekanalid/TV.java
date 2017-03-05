package Telekanalid;

public class TV implements BroadcastListener {
    protected String owner;

    public TV(String owner) {
        this.owner = owner;
    }

    @Override
    public void listen(String news) {
        System.out.println("\nTV omanik on " + owner);
        System.out.println(news);
    }



}
