package DungeosDude;

public class Dot implements Effect {
    private boolean expired = true;
    private int duration = 0;
    private int cost = 5;

    @Override
    public void onHit(Dude target, Dude myself) {
        expired = false;
        duration = 5;
        target.takeDamage(1);
        System.out.println("Vastane hakkas veritsema! Vastasel jäi " + target.getHealth() + " elu.");
    }

    @Override
    public void beforeTurn(Dude target, Dude myself) {
        if (duration>2){
            target.takeDamage(1);
            System.out.println("Vastane veritseb! Vastasel jäi " + target.getHealth() + " elu.");
        }
        if (duration == 0) expired = true;
        duration--;
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
