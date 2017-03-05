package DungeonsDudes;/*
 * Created by L1ND3 on 04.03.2017. 
 */

public class Self_Stealth implements Effect {
    private int cost = 5;
    private boolean expired = true;
    private int duration = 5;

    @Override
    public void onHit(Dude target) {
        target.changeArmor(7);
        System.out.println("Sain adrenaliini laksu!(Armor + 7)");
        expired = false;
    }

    @Override
    public void beforeTurn(Dude target) {
        if (duration == 3){
            target.changeArmor(-7);
            System.out.println("Adrenaliini laks on läbi!(Armor -7)");
        }
        if (duration == 0){
            expired = true;
        }
        duration--;
    }

    @Override
    public void afterTurn(Dude target) {

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
