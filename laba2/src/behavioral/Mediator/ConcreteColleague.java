package behavioral.Mediator;

class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
