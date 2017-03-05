package DungeonsDudes;/*
 * Created by L1ND3 on 05.03.2017. 
 */

public class Daggers implements Effect {
    private boolean expired = true;
    private int duration = 0;
    private int cost = 2;

    @Override
    public void onHit(Dude target, Dude myself) {
        int hit = (int) Math.round(Math.random()*4+1);
        target.takeDamage(hit);
        System.out.println("Lõin vastast noaga ja tegin " + hit + " dmg. Vastesel jäi alles " + target.getHealth() + " elu.");
    }

    @Override
    public void beforeTurn(Dude target, Dude myself) {

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
        System.out.println("Lõin noaga mööda.");
    }
}
