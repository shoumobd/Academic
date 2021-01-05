package village_shapes;

public class Dot extends BasicShape{
    @Override
    public void draw() {
        System.out.println("Currently in Dot::draw() method.");
    }

    @Override
    public String toString() {
        return ("Dot, Label: "+label);
    }
}
