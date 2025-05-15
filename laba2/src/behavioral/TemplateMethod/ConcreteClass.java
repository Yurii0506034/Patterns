package behavioral.TemplateMethod;

public class ConcreteClass extends AbstractClass {
    @Override
    void stepOne() {
        System.out.println("Step One");
    }

    @Override
    void stepTwo() {
        System.out.println("Step Two");
    }

    @Override
    void stepThree() {
        System.out.println("Step Three");
    }
}
