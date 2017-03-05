package DungeonsDudes;


public class DuelTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter 1");
        Fighter fighter2 = new Fighter("Fighter 2");
        Rogue rogue1 = new Rogue("Rogue 1");
        Rogue rogue2 = new Rogue("Rogue 2");
        Wizard wizard1 = new Wizard("Wizard 1");
        Wizard wizard2 = new Wizard("Wizard 2");
        Attack(fighter1, wizard2);
//        Attack(rogue1, wizard2);
//        Attack(rogue1, fighter2);
//        Attack(fighter1, fighter2);
//        Attack(wizard1, wizard2);
//        Attack(rogue1, rogue2);
    }

    public static void Attack(Dude enemy1, Dude enemy2){
        while(true){
            enemy1.takeTurn(enemy2);
            if (!enemy2.isAlive()){
                System.out.println(enemy1.getName() + " võitis!");
                return;
            }
            enemy2.takeTurn(enemy1);
            if (!enemy1.isAlive()){
                System.out.println(enemy2.getName() + " võitis!");
                return;
            }
        }
    }
}
