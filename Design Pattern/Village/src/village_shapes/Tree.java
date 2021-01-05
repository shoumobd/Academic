package village_shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree extends BasicShape{
    protected List<Shape> children = new ArrayList<>(Arrays.asList(new Line(), new Line(), new Rectangle()));

    public Tree() {
        super();
    }
    public Tree(String label) {
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
        System.out.println("Currently in Tree::draw() method.");
    }

    @Override
    public String toString() {
        return ("Tree, Label: "+label);
    }
}