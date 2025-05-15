package behavioral;

import behavioral.Strategy.ConcreteStrategyA;
import behavioral.Strategy.Strategy;
import behavioral.chainofresponsibility.*;
import behavioral.command.*;
import behavioral.Iterator.*;
import behavioral.Mediator.*;
import behavioral.Memento.*;
import behavioral.Observer.*;
import behavioral.State.*;
import behavioral.TemplateMethod.*;
import behavioral.Visitor.*;

public class Main {
    public static void main(String[] args) {
        // ... (інші патерни) ...

        // 7. Стан (State)
        System.out.println("Патерн 'Стан':");
        behavioral.State.Context stateContext = new behavioral.State.Context(new ConcreteStateA());
        stateContext.equals();
        stateContext.rename(new ConcreteStateB());
        stateContext.equals();
        System.out.println();

        // 8. Стратегія (Strategy)
        System.out.println("Патерн 'Стратегія':");
        Strategy strategy = new ConcreteStrategyA() {
            @Override
            public int execute(int a, int b) {
                return 0;
            }
        };
        behavioral.Strategy.Context strategyContext = new behavioral.Strategy.Context(strategy);
        strategyContext.executeStrategy();

        strategyContext.setStrategy(new ConcreteStrategyB());
        strategyContext.executeStrategy();
        System.out.println();

        // 6. Спостерігач (Observer)
        System.out.println("Патерн 'Спостерігач':");
        ConcreteSubject subject = new ConcreteSubject() {
            @Override
            public void addObserver(Observer observer) {
                // Додайте код для додавання спостерігача
            }

            @Override
            public void removeObserver(Observer observer) {
                // Додайте код для видалення спостерігача
            }

            @Override
            public void rename(String s) {
                // Додайте код для перейменування
            }
        };
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("State 1");
        subject.setState("State 2");
        System.out.println();

        // ... (інші патерни) ...
    }
}