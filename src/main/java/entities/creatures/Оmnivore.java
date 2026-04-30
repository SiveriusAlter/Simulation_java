package entities.creatures;

import entities.Eatable;

public class Оmnivore extends Creature implements Eatable {

    public Оmnivore(String name, int speed, int hitPoints) {
        super(name, speed, hitPoints);
    }

    @Override
    public int beEaten(int biteForce) {
        return getHitPoints();
    }
}
