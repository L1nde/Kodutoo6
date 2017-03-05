package DungeosDude;

public interface Effect{
    void onHit(Dude target, Dude myself);
    void beforeTurn(Dude target, Dude myself);
    void afterTurn(Dude target, Dude myself);
    boolean isExpired();
    int getCost();
    void miss();

}
