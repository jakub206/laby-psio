package exercise3;

abstract public class Content {
    protected String title;
    protected String author;

    abstract public void render();

    public Content(String title, String author){
        this.title = title;
        this.author = author;
    }
}
