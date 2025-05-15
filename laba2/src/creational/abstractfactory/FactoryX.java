package creational.abstractfactory;

public class FactoryX implements AbstractFactory {
    public AbstractProduct createProduct() {
        return new ProductX();
    }
}
