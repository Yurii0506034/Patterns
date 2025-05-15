import java.util.function.*;

public class Main {

    // ===== 1. Strategy Pattern (Function) =====
    interface PaymentStrategy extends Function<Double, String> {}

    static void useStrategy(double amount, PaymentStrategy strategy) {
        String result = strategy.apply(amount);
        System.out.println("Payment result: " + result);
    }

    // ===== 2. Factory Method Pattern (Supplier) =====
    interface Product {
        void show();
    }

    static class ProductA implements Product {
        public void show() {
            System.out.println("Product A created");
        }
    }

    static class ProductB implements Product {
        public void show() {
            System.out.println("Product B created");
        }
    }

    static Product createProduct(Supplier<Product> factory) {
        return factory.get();
    }

    // ===== 3. Decorator Pattern (Function chaining) =====
    static Function<String, String> baseProcessor = text -> text;

    static Function<String, String> toUpperCaseDecorator = text -> text.toUpperCase();
    static Function<String, String> addExclamationDecorator = text -> text + "!!!";

    // ===== 4. Execute Around Pattern =====
    static void executeAround(Runnable before, Runnable action, Runnable after) {
        before.run();
        action.run();
        after.run();
    }

    public static void main(String[] args) {

        // === 1. Strategy ===
        PaymentStrategy creditCard = amount -> "Paid $" + amount + " with credit card";
        PaymentStrategy paypal = amount -> "Paid $" + amount + " with PayPal";

        useStrategy(150.0, creditCard);
        useStrategy(79.99, paypal);

        System.out.println("------------");

        // === 2. Factory Method ===
        Product product1 = createProduct(ProductA::new);
        product1.show();

        Product product2 = createProduct(ProductB::new);
        product2.show();

        System.out.println("------------");

        // === 3. Decorator (Function chaining) ===
        Function<String, String> decorated = baseProcessor
                .andThen(toUpperCaseDecorator)
                .andThen(addExclamationDecorator);

        String result = decorated.apply("hello functional world");
        System.out.println("Decorated text: " + result);

        System.out.println("------------");

        // === 4. Execute Around ===
        executeAround(
                () -> System.out.println("Opening resource..."),
                () -> System.out.println("Executing action..."),
                () -> System.out.println("Closing resource...")
        );
    }
}
