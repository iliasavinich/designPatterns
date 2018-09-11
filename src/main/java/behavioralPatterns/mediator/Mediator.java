package behavioralPatterns.mediator;

public interface Mediator {
    void registerRunway(Runway runway);
    void registerFlight(Flight flight);
    boolean isLandingOk();
    void setLandingStatus(boolean status);
}
