package behavioralPatterns.mediator;

public class MediatorExample {
    public static void main(String[] args) {
        Mediator mediator = new ATCMediator();
        Flight sparrow101 = new Flight(mediator);
        Runway mainRunway = new Runway(mediator);
        mediator.registerFlight(sparrow101);
        mediator.registerRunway(mainRunway);
        sparrow101.getReady();
        mainRunway.land();
        sparrow101.land();
    }
}
