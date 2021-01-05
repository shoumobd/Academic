package village;

import editor.VillageEditor;
import village_shapes.*;

public class Main {
    public static void main(String[] args) {
        VillageEditor editor = new VillageEditor();
        editor.loadComponent(new House("A's House"), new Tree(), new WaterSource("Blue WaterSource"));
        editor.viewAll();
        editor.draw();
        editor.clear();
        editor.loadComponent(new Dot(), new Square(), new House());
        editor.viewAll();
        editor.draw();
    }
}
