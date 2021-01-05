package village_shapes;

public class Rectangle extends BasicShape{
    @Override
    public void draw() {
        System.out.println("Currently in Rectangle::draw() method.");
    }

    @Override
    public String toString() {
        return ("Rectangle, Label: "+label);
    }
}
