package entities.creatures;

public class Herbivore extends Creature
{
    public Herbivore(String name, int speed, int hitPoints) {
        super(name, speed, hitPoints);
    }

    @Override
    public int beEaten(int biteForce) {
        return getHitPoints();
    }
}
