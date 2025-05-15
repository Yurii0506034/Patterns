package behavioral.Strategy;

public abstract class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing ConcreteStrategyA");
    }
}