package behavioralPatterns.template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println(this.getClass().getSimpleName()+ " is init()");
    }

    @Override
    void startPlay() {
        System.out.println(this.getClass().getSimpleName()+ " startPlay()");
    }

    @Override
    void endPlay() {
        System.out.println(this.getClass().getSimpleName()+ " endPlay()");
    }
}
