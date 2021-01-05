package editor;

import village_shapes.*;

import java.util.Arrays;

public class VillageEditor extends CompositeShape{
    protected CompositeShape allShapes = new CompositeShape();

    public void loadComponent(Shape... component) {
        allShapes.clear();
        allShapes.add(component);
    }

    public void viewAll() {
        System.out.println("Currently loaded village components: ");
        for (Shape component : allShapes.getComponents()) {
            System.out.println("- "+component+"; contains "+component.getComponents().size()+" components.");
            for (Shape child : component.getComponents()) {
                System.out.println(child);
            }
        }
    }

    public void draw() {
        allShapes.draw();
        for (Shape component : allShapes.getComponents()) {
            component.draw();
            for (Shape child : component.getComponents()) {
                child.draw();
            }
        }
    }
}
