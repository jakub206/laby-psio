package graphicSystem;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Renderable> renderables = new ArrayList<>();

        renderables.add(new ImageTexture("src/graphicSystem/images/logo.png"));
        renderables.add(new RectangleShape(21,73));
        renderables.add(new Sprite("Enemy"));
        renderables.add(new RectangleShape(12,3));
        renderables.add(new TextLabel("Hello World!"));
        renderables.add(new ImageTexture("src/graphicSystem/images/background.png"));
        renderables.add(new Sprite("Player1"));
        renderables.add(new TextLabel("The end"));
        renderables.add(new Sprite("Player2"));
        renderables.add(new RectangleShape(4,2));

        for (Renderable renderable : renderables) {
            renderable.render();
        }
    }
}
