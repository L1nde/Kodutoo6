package DungeosDude;

public class Punch implements Effect {
    private boolean expired = true;
    private int duration = 0;
    private int cost = 1;

    @Override
    public void onHit(Dude target, Dude myself) {
        int hit = (int) Math.round(Math.random()*2);
        target.takeDamage(hit);
        System.out.println("Lõin rusikaga ja tegin " + hit + " dmg. Vastasel jäi " + target.getHealth() + " elu.");
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
        System.out.println("Lõin rusikaga mööda!");
    }

}
