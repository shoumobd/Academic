package village_shapes;

public class Triangle extends BasicShape{
    @Override
    public void draw() {
        System.out.println("Currently in Triangle::draw() method.");
    }

    @Override
    public String toString() {
        return ("Triangle, Label: "+label);
    }
}
