package entities.creatures;

import entities.Eatable;
import entities.Eater;
import entities.Entity;
import entities.creatures.properties.Hp;
import entities.creatures.properties.Speed;

public abstract class Creature extends Entity implements Eatable, Eater {
    private int speed = Speed.MEDIUM.getSpeed();
    private int hitPoints = Hp.MEDIUM.getHpValue();
    private int biteForce = 35;

    public static final int BASE_SATIETY = 100;
    public static final int FOOD_DIGESTIBILITY_COEFFICIENT = 4;

    private int satiety = BASE_SATIETY;

    public Creature(String name, int speed, int hitPoints) {
        super(name);
        setSpeed(speed);
        setHitPoints(hitPoints);
    }

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    protected void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int beEaten(int biteForce) {
        int newHitPoints = hitPoints - biteForce;
        if(newHitPoints < 1) {
            newHitPoints = 0;
        }
        setHitPoints(newHitPoints);
        return getHitPoints();
    }

    public void eat(Eatable entity) {
        satiety = BASE_SATIETY;
       int newHitPoints = hitPoints + entity.beEaten(biteForce) / FOOD_DIGESTIBILITY_COEFFICIENT;
       setHitPoints(newHitPoints);
    }
}
