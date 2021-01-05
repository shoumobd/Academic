package village_shapes;

public class Line extends BasicShape{
    @Override
    public void draw() {
        System.out.println("Currently in Line::draw() method.");
    }

    @Override
    public String toString() {
        return ("Line, Label: "+label);
    }
}
