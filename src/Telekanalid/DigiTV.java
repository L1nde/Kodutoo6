package Telekanalid;

import java.util.ArrayList;
import java.util.List;

public class DigiTV extends TV {
    private List<String> oldNews = new ArrayList<>();

    public DigiTV(String owner) {
        super(owner);
    }

    @Override
    public void listen(String news) {
        System.out.println("\nTV omanik on " + super.owner);
        System.out.println(news);
        oldNews.add(news);
    }

    public void replayAll(){
        System.out.println("\nTV omanik on " + super.owner + "\nReplay mode");
        for (String story : oldNews) {
            System.out.println(story);
        }
    }

}
