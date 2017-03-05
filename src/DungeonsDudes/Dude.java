package DungeonsDudes;

import java.util.Collections;
import java.util.List;

public abstract class Dude {
    private String name;
    private int accuracy;
    private int health;
    private int armor;
    private int actionPoints;
    private List<Effect> actions;
    private int recharge;
    private final int maxActionPoints;

    public Dude(String name, int accuracy, int health, int armor, int actionPoints, List<Effect> actions, int recharge) {
        this.name = name;
        this.accuracy = accuracy;
        this.health = health;
        this.armor = armor;
        this.actionPoints = actionPoints;
        this.actions = actions;
        this.recharge = recharge;
        this.maxActionPoints = actionPoints;
    }

    void takeTurn(Dude target){
        Dude enemy = target;
        System.out.println(name + " ründab!");
        Collections.shuffle(actions);
        for (Effect action : actions) {
            if (!action.isExpired()){
                action.beforeTurn(target, this);
            }
        }
        for (Effect action : actions) {
            if (action.isExpired() && action.getCost() <= actionPoints) {
                if (Math.round(Math.random() * 20) + accuracy >= target.armor || action.getClass().toString().contains("Self_")) {
                    action.onHit(target, this);
                } else {
                    action.miss();
                }
                actionPoints -= action.getCost();
            }
        }
        for (Effect action : actions) {
            if (!action.isExpired()){
                action.afterTurn(target, this);
            }
        }
        actionPoints += recharge;
        if (maxActionPoints<actionPoints){
            actionPoints = maxActionPoints;
        }
        System.out.println();
    }

    boolean isAlive(){
     return health > 0;
    }

    void takeDamage(int damage){
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void changeArmor(int points){
        armor += points;
    }

    public void changeHealth(int points){
        health += points;
    }
}
