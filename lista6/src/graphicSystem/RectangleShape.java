package graphicSystem;

import java.awt.*;

public class RectangleShape implements Renderable {
    private int width;
    private int height;

    public RectangleShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void render() {
        System.out.println("RectangleShape rendering...");
    }
}
