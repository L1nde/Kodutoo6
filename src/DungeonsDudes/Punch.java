package DungeonsDudes;/*
 * Created by L1ND3 on 03.03.2017. 
 */

public class Punch implements Effect {
    private boolean expired = true;
    private int duration = 0;
    private int cost = 1;


    @Override
    public void onHit(Dude target) {
        int hit = (int) Math.round(Math.random()*2);
        target.takeDamage(hit);
        System.out.println("Lõin rusikaga ja tegin " + hit + " dmg. Vastasel jäi " + target.getHealth() + " elu.");
    }

    @Override
    public void beforeTurn(Dude target) {

    }

    @Override
    public void afterTurn(Dude target) {
    }

    @Override
    public boolean isExpired() {
        return expired;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void miss() {
        System.out.println("Lõin rusikaga mööda!");
    }

}
