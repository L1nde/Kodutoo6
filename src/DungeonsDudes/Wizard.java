package DungeonsDudes;/*
 * Created by L1ND3 on 03.03.2017. 
 */

import java.util.Arrays;

public class Wizard extends Dude {

    public Wizard(String name) {
        super(name, 8, 7, 0, 7, Arrays.asList(new FireBall(), new Dot(), new Self_Heal()),5);
    }
}
