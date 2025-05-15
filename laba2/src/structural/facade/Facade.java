package structural.facade;

class ComplexSystem {
    void operation() {
        System.out.println("Complex system operation");
    }
}

public class Facade {
    private ComplexSystem complexSystem = new ComplexSystem();

    public void simpleOperation() {
        complexSystem.operation();
    }
}
