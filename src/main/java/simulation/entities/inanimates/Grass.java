package simulation.entities.inanimates;

import simulation.entities.Eatable;
import simulation.entities.Entity;

public class Grass extends Entity implements Eatable {
    private int calories = 0;
    private static final int GROWTH = 10;

    public Grass(String name, int calories) {
        super(name);
        this.calories = calories;
    }

    @Override
    public void makeMove() {
        calories += GROWTH;
    }

    @Override
    public int beEaten(int biteForce) {
        return calories;
    }
}
