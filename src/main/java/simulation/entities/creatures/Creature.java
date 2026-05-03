package simulation.entities.creatures;

import simulation.Scannable;
import simulation.entities.Eatable;
import simulation.entities.Eater;
import simulation.entities.Entity;
import simulation.entities.creatures.properties.Hp;
import simulation.entities.creatures.properties.Speed;

import java.util.List;

public abstract class Creature extends Entity implements Eatable, Eater {
    private int speed = Speed.MEDIUM.getSpeed();
    private int hitPoints = Hp.MEDIUM.getHpValue();
    private int biteForce = Hp.MEDIUM.getHpValue();
    private boolean isAlive = true;

    private static final int BASE_SATIETY = 100;
    private static final int STARVATION_RATIO = 10;
    private static final int FOOD_DIGESTIBILITY_DIVISOR = 4;
    private static final int DEATH_RATE = 0;

    private int satiety = BASE_SATIETY;

    public Creature(String name) {
        super(name);
    }

    public boolean isAlive() {
        return isAlive;
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



    public void makeMove() {
        starve();



        checkDeath();
    }

    public int beEaten(int biteForce) {
        int newHitPoints = hitPoints - biteForce;
        if(newHitPoints < DEATH_RATE) {
            newHitPoints = DEATH_RATE;
        }
        setHitPoints(newHitPoints);
        return getHitPoints();
    }

    public void eat(Eatable entity) {
        satiety = BASE_SATIETY;
        int receivedFood = entity.beEaten(biteForce);
       int newHitPoints = hitPoints + receivedFood / FOOD_DIGESTIBILITY_DIVISOR;
       setHitPoints(newHitPoints);
    }

    private void starve()
    {
        satiety = BASE_SATIETY - STARVATION_RATIO;
        if(satiety <= DEATH_RATE) {
            hitPoints = DEATH_RATE;
            return;
        }

        if(satiety < BASE_SATIETY/2) {
            int loseHits = hitPoints - hitPoints / STARVATION_RATIO;
            hitPoints -= loseHits;
        }
    }

    public void checkDeath() {
        if(hitPoints <= 0) {
            isAlive = false;
        }
    }
}
