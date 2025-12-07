package exercise3;

public class Main {
    public static void main(String[] args) {
        Content[] contents = new Content[3];

        contents[0] = new TechnicalArticle("Wstęp do Javy", "Jakub Dłużak", "Java jest to obiektowy język programowanie, który ma spore zastosowanie...", "Java");
        contents[1] = new Article("Zastosowanie kwasów karboksylowych w przemyśle", "Joanna Kowalska", "Kwasy karboksylowe mają ogromne zastosowanie w współczesnym przemyśle...");
        contents[2] = new TechnicalArticle("Czy HTML to język programowania?", "Oliwier Nowak", "HTML przez wielu programistów uznawany jest za...", "HTML");

        for(Content content : contents){
            content.render();
            System.out.println();
        }
    }
}
