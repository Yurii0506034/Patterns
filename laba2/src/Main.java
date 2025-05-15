package creational;

// Singleton Pattern
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance!");
    }
}

// Factory Method Pattern
interface Product {
    void use();
}

class ConcreteProductA implements Product {
    public void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB implements Product {
    public void use() {
        System.out.println("Using Product B");
    }
}

class ProductFactory {
    public static Product createProduct(String type) {
        return switch (type) {
            case "A" -> new ConcreteProductA();
            case "B" -> new ConcreteProductB();
            default -> throw new IllegalArgumentException("Unknown product type");
        };
    }
}

// Abstract Factory Pattern
interface AbstractProduct {
    void info();
}

class ProductX implements AbstractProduct {
    public void info() {
        System.out.println("Product X created");
    }
}

class ProductY implements AbstractProduct {
    public void info() {
        System.out.println("Product Y created");
    }
}

interface AbstractFactory {
    AbstractProduct createProduct();
}

class FactoryX implements AbstractFactory {
    public AbstractProduct createProduct() {
        return new ProductX();
    }
}

class FactoryY implements AbstractFactory {
    public AbstractProduct createProduct() {
        return new ProductY();
    }
}

// Builder Pattern
class ProductBuilder {
    private String partA;
    private String partB;

    public ProductBuilder setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public ProductBuilder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public ProductBuilt build() {
        return new ProductBuilt(partA, partB);
    }
}

class ProductBuilt {
    private final String partA;
    private final String partB;

    public ProductBuilt(String partA, String partB) {
        this.partA = partA;
        this.partB = partB;
    }

    public void show() {
        System.out.println("Built Product with: " + partA + " and " + partB);
    }
}

// Prototype Pattern
class Prototype implements Cloneable {
    private String data;

    public Prototype(String data) {
        this.data = data;
    }

    public void show() {
        System.out.println("Prototype Data: " + data);
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}

// Main class to demonstrate patterns
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Method
        Product productA = ProductFactory.createProduct("A");
        productA.use();

        Product productB = ProductFactory.createProduct("B");
        productB.use();

        // Abstract Factory
        AbstractFactory factoryX = new FactoryX();
        AbstractProduct productX = factoryX.createProduct();
        productX.info();

        AbstractFactory factoryY = new FactoryY();
        AbstractProduct productY = factoryY.createProduct();
        productY.info();

        // Builder
        ProductBuilt builtProduct = new ProductBuilder()
                .setPartA("Feature A")
                .setPartB("Feature B")
                .build();
        builtProduct.show();

        // Prototype
        Prototype prototype1 = new Prototype("Original");
        prototype1.show();

        Prototype prototype2 = prototype1.clone();
        prototype2.show();
    }
}
