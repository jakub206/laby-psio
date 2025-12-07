package graphicSystem;

public class ImageTexture implements Renderable {
    private String filePath;

    public ImageTexture(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void render() {
        System.out.println("ImageTexture ("+filePath+") rendering...");
    }
}
