package village_shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeShape extends BasicShape{
    protected List<Shape> children = new ArrayList<>();

    public CompositeShape(String label) {
        this.label=label;
    }

    public CompositeShape(Shape... components) {
        add(components);
    }

    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        children.remove(child);
    }

    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public List<Shape> getComponents() {
        return children;
    }

    @Override
    public void draw() {
        System.out.println("Currently in CompositeShape::draw() method.");
    }

    @Override
    public String toString() {
        return ("CompositeShape, Label: "+label);
    }
}
