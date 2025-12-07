package exercise3;

public class TechnicalArticle extends Article {
    private String technology;

    public TechnicalArticle(String title, String author, String text, String technology) {
        super(title, author, text);
        this.technology = technology;
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Technology: "+technology);
    }
}
