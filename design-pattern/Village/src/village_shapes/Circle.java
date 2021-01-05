package village_shapes;

public class Circle extends BasicShape{
    @Override
    public void draw() {
        System.out.println("Currently in circle::draw() method.");
    }

    @Override
    public String toString() {
        return ("Circle, Label: "+label);
    }
}

