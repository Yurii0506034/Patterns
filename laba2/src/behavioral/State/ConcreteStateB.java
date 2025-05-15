package behavioral.State;

public class ConcreteStateB implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State B action");
        context.setState(new ConcreteStateA());
    }
}
