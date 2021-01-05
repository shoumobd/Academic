package village_shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterSource extends BasicShape{
    protected List<Shape> children = new ArrayList<>(Arrays.asList(new Circle(), new Rectangle()));

    public WaterSource() {
        super();
    }

    public WaterSource(String label) {
        this.label=label;
    }

    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    @Override
    public List<Shape> getComponents() {
        return children;
    }

    @Override
    public void draw() {
        System.out.println("Currently in WaterSource::draw() method.");
    }

    @Override
    public String toString() {
        return ("WaterSource, Label: "+label);
    }
}