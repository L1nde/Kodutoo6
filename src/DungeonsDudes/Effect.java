package DungeonsDudes;/*
 * Created by L1ND3 on 03.03.2017. 
 */

public interface Effect{
    void onHit(Dude target);
    void beforeTurn(Dude target);
    void afterTurn(Dude target);
    boolean isExpired();
    int getCost();
    void miss();

}
