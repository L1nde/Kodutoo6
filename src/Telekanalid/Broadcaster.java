package Telekanalid;

import java.util.ArrayList;
import java.util.List;

public class Broadcaster {
    private List<BroadcastListener> subscribers;

    public Broadcaster() {
        this.subscribers = new ArrayList<>();
    }

    void subscribe(BroadcastListener listener){
        subscribers.add(listener);
    }

    void broadcast(String news){
        for (BroadcastListener subscriber : subscribers) {
            subscriber.listen(news);
        }
    }
}
