package entities.inanimates;

import entities.Eatable;
import entities.Entity;

public class Grass extends Entity implements Eatable {
    private int calories = 0;

    public Grass(String name) {
        super(name);
    }

    @Override
    public int beEaten(int biteForce) {
        return calories;
    }
}
