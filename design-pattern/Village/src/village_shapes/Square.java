package village_shapes;

public class Square extends BasicShape{
    @Override
    public void draw() {
        System.out.println("Currently in Square::draw() method.");
    }

    @Override
    public String toString() {
        return ("Square, Label: "+label);
    }
}
