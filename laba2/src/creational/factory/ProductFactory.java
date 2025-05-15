package creational.factory;

public class ProductFactory {
    public static Product createProduct(String type) {
        return switch (type) {
            case "A" -> new ConcreteProductA();
            case "B" -> new ConcreteProductB();
            default -> throw new IllegalArgumentException("Unknown product type");
        };
    }
}
