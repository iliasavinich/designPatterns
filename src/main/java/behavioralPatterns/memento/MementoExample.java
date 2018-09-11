package behavioralPatterns.memento;

public class MementoExample {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker taker = new CareTaker();
        originator.setState("State 1");
        originator.setState("State 2");
        taker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        taker.add(originator.saveStateToMemento());

        originator.setState("State 4");

        System.out.println("Current state: " + originator.getState());
        originator.getStateFromMemento(taker.get(1));
        System.out.println("Second saved state: " + originator.getState());
    }
}
