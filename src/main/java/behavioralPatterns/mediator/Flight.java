package behavioralPatterns.mediator;

public class Flight implements Command {
    public Mediator mediator;

    public Flight(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        if(mediator.isLandingOk()){
            System.out.println("Landing done...");
            mediator.setLandingStatus(true);
        } else{
            System.out.println("Will wait to land...");
        }
    }

    public void getReady(){
        System.out.println("Getting ready..");
    }
}
