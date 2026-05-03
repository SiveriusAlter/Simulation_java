package simulation.entities;

public abstract class Entity {

    private String name;

    public Entity(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public abstract void makeMove();
}
