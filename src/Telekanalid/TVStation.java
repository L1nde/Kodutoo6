package Telekanalid;

import java.util.List;

public class TVStation extends PropagandaStation{
    private List<String> news;

    public TVStation(List<String> news) {
        super();
        this.news = news;
    }

    @Override
    public void broadcastNow(){
        broadcast(news.get((int) Math.round(Math.random()*(news.size()-1))));
    }
}
