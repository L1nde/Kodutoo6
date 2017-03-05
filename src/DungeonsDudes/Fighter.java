package DungeonsDudes;/*
 * Created by L1ND3 on 03.03.2017. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fighter extends Dude {

    public Fighter(String name) {
        super(name, 7, 20, 10, 5, Arrays.asList(new Punch(), new Dot()), 3);

    }
}
