package Telekanalid;

import java.util.ArrayList;
import java.util.List;

public class TestTV {
    public static void main(String[] args) {

        List<String> news = new ArrayList<>();
        news.add("Eurovisioonile sõidavad Koit Toome ja Laura.");
        news.add("Eesti Panga asepresident: riik võiks võtta ülesandeks sära ettevõtjate silmi tagasi tuua.");
        news.add("Klavan teenis Liverpooli meedialt väga kõrged hinded.");
        news.add("Trump süüdistab Obamat oma kõnede pealtkuulamises, Obama eitab kategooriliselt.");
        DigiTV digiTV1 = new DigiTV("Kim Jong-un");
        DigiTV digiTV2 = new DigiTV("Kim Yong-nam");
        TV tv1 = new TV("Pak Pong-ju");
        PropagandaStation nkNationalNews = new PropagandaStation();
        TVStation foxNews = new TVStation(news);
        PirateStation nkWorldNews = new PirateStation(null);
        foxNews.subscribe(nkWorldNews);


        foxNews.subscribe(digiTV1);
        foxNews.subscribe(digiTV2);
        nkNationalNews.subscribe(digiTV1);
        nkNationalNews.subscribe(digiTV2);
        nkNationalNews.subscribe(tv1);
        nkWorldNews.subscribe(digiTV1);
        nkWorldNews.subscribe(digiTV2);
        nkWorldNews.subscribe(tv1);

        foxNews.broadcastNow();
        nkNationalNews.broadcastNow();
        nkWorldNews.broadcastNow();

        digiTV1.replayAll();

    }
}
