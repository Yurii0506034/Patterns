package behavioral;

import behavioral.Strategy.Strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public int execute(int a, int b) {
        return 0;
    }

    @Override
    public void execute() {
        System.out.println("Executing ConcreteStrategyB");
    }
}