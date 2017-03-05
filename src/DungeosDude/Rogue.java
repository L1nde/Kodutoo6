package DungeosDude;

import java.util.Arrays;

public class Rogue extends Dude {

    public Rogue(String name) {
        super(name, 5, 10, 7,5, Arrays.asList(new Self_Stealth(), new Daggers(), new Dot()), 3);
    }
}
