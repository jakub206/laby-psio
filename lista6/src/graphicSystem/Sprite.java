package graphicSystem;

import java.awt.*;

public class Sprite implements Renderable {
    private String name;

    public Sprite(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Sprite ("+name+") rendering...");
    }
}
