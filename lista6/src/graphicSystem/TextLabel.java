package graphicSystem;

public class TextLabel implements Renderable {
    private String text;

    public TextLabel(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("TextLabel ("+text+") rendering...");
    }
}
