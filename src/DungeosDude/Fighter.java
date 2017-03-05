package DungeosDude;

import java.util.Arrays;

public class Fighter extends Dude {

    public Fighter(String name) {
        super(name, 7, 20, 10, 5, Arrays.asList(new Punch(), new Dot()), 3);
    }
}
