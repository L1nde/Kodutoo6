package DungeonsDudes;/*
 * Created by L1ND3 on 03.03.2017. 
 */

import java.util.Arrays;

public class Rogue extends Dude {

    public Rogue(String name) {
        super(name, 5, 10, 7,5, Arrays.asList(new Self_Stealth(), new Punch()), 3);
    }
}
