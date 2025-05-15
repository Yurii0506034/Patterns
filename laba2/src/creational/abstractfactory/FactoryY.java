package creational.abstractfactory;

public class FactoryY implements AbstractFactory {
    public AbstractProduct createProduct() {
        return new ProductY();
    }
}
