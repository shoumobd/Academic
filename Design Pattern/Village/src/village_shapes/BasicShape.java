package village_shapes;

import java.util.Collections;
import java.util.List;

abstract class BasicShape implements Shape{
    protected String label;

    public BasicShape() {
        this.label="Unlabelled";
    }

    public BasicShape(String label) {
        this.label=label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public void draw() {
        System.out.println("Currently in BasicShape::draw() method.");
    }

    @Override
    public String toString() {
        return ("BasicShape, Label: "+label);
    }

    @Override
    public List<Shape> getComponents() {
        return Collections.emptyList();
    }
}
