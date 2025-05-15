package behavioral.State;

public class ConcreteStateA implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State A action");
        context.setState(new ConcreteStateB());
    }
}
