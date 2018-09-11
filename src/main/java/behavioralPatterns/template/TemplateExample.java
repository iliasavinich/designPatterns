package behavioralPatterns.template;

public class TemplateExample {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        System.out.println();
        game = new Volleyball();
        game.play();
    }
}
