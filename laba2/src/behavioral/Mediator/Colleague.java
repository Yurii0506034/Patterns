package behavioral.Mediator;

abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void sendMessage(String message);
    abstract void receiveMessage(String message);
}
