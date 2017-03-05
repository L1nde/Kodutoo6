package DungeonsDudes;/*
 * Created by L1ND3 on 03.03.2017. 
 */

public interface Effect{
    void onHit(Dude target, Dude myself);
    void beforeTurn(Dude target, Dude myself);
    void afterTurn(Dude target, Dude myself);
    boolean isExpired();
    int getCost();
    void miss();

}
