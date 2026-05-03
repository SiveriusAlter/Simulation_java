package simulation.entities.creatures.properties;

public enum Hp {
    LOW (50),
    MEDIUM(100),
    HIGH(150),
    HONEY_BADGER(200);


    private int hpValue;

    Hp(int hpValue) {
        this.hpValue = hpValue;
    }

    public int getHpValue() {
        return hpValue;
    }
}