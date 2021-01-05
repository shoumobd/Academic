package village_shapes;

import java.util.List;

public interface Shape {
    void draw();
    String toString();
    List<Shape> getComponents();
}
