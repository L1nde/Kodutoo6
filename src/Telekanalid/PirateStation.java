package Telekanalid;

import java.util.List;

public class PirateStation extends TVStation implements BroadcastListener {
    private String story;

    public PirateStation(List<String> news) {
        super(news);
    }

    @Override
    public void listen(String news) {
        story = news;
    }

    public void broadcastNow(){
        String[] announcements = {"Rünnak!", "Hail,  free North Korea!"};
        broadcast(announcements[(int) Math.round(Math.random() * (announcements.length - 1))] + "\n" + story);
    }

}
