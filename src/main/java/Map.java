import entities.Entity;

import java.awt.Point;
import java.util.HashMap;

public class Map {

    private HashMap<Point, Entity> map;

    public Entity getEntity(Point point) {

        return map.get(point);
    }

    public void deleteEntity(Point point) {
        map.remove(point);
    }
}
