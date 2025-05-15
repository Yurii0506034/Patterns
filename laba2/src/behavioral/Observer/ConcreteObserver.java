package behavioral.Observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(String message) {
        // Логіка для оновлення спостерігача
        System.out.println("State updated: " + message);
    }
}