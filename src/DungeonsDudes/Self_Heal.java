package DungeonsDudes;/*
 * Created by L1ND3 on 05.03.2017. 
 */

public class Self_Heal implements Effect{
    private boolean expired = true;
    private int duration = 5;
    private int cost = 5;

    @Override
    public void onHit(Dude target, Dude myself) {
        myself.changeHealth(5);
        expired = false;
        System.out.println("Ravisin ennast!(health + 5)");
    }

    @Override
    public void beforeTurn(Dude target, Dude myself) {
        duration--;
        if (duration == 0){
            expired = true;
        }
    }

    @Override
    public void afterTurn(Dude target, Dude myself) {

    }

    @Override
    public boolean isExpired() {
        return expired;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void miss() {

    }
}
