package behavioral.State;

public class Context {
    private State state;

    public Context(ConcreteStateA concreteStateA) {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void executeAction() {
        state.doAction(this);
    }

    public void rename(ConcreteStateB concreteStateB) {
    }

    public void equals() {
    }
}
