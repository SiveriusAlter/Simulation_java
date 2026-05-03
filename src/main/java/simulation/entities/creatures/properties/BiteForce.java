package simulation.entities.creatures.properties;

public enum BiteForce {
    LOW (35),
    MEDIUM(50),
    HIGH(100),
    HONEY_BADGER(200);


    private int biteForce;

    BiteForce(int biteForce) {
        this.biteForce = biteForce;
    }

    public int getHpValue() {
        return biteForce;
    }
}
