package simulation.entities.creatures.properties;

public enum Speed {
    LOW(1),
    MEDIUM(2),
    FAST(3);

    private int speed;

    Speed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
