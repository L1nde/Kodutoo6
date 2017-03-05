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

    public Dude(String name, int accuracy, int health, int armor, int actionPoints, List<Effect> actions, int recharge) {
        this.name = name;
        this.accuracy = accuracy;
        this.health = health;
        this.armor = armor;
        this.actionPoints = actionPoints;
        this.actions = actions;
        this.recharge = recharge;
    }

    void takeTurn(Dude target){
        System.out.println(name + " ründab!");
        Collections.shuffle(actions);
        for (Effect action : actions) {
            action.beforeTurn(target);
            if(action.isExpired() && action.getCost() < actionPoints){
                if (action.getClass().toString().contains("Self_")){
                    action.onHit(this);
                }
                else if (Math.round(Math.random()*20) + accuracy >= target.armor){
                    action.onHit(target);
                }
                else{
                    action.miss();
                }
                actionPoints -= action.getCost();
            }
        }
        actionPoints += recharge;
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
}
