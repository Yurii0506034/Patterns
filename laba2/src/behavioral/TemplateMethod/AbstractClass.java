package behavioral.TemplateMethod;

public abstract class AbstractClass {
    public void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepThree();
}
