package exercise3;

public class Article extends Content{
    protected String text;

    public Article(String title, String author, String text){
        super(title, author);
        this.text = text;
    }

    @Override
    public void render(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println(text);
    }
}
