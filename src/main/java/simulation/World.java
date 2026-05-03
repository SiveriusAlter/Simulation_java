package simulation;

import simulation.entities.Eatable;
import simulation.entities.Entity;

import java.awt.Point;
import java.util.HashMap;
import java.util.List;

public class World {

    private HashMap<Point, Entity> map;

    public Entity getEntity(Point point) {

        return map.get(point);
    }

    public void deleteEntity(Point point) {
        map.remove(point);
    }

    public List<Eatable> scan() {
        return List.of();
    }
}
