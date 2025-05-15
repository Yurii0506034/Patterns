package structural;

import structural.adapter.*;
import structural.bridge.*;
import structural.composite.*;
import structural.decorator.*;
import structural.facade.*;
import structural.flyweight.*;
import structural.proxy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демо роботи структурних патернів ===\n");

        // 1. Адаптер (Adapter)
        System.out.println("Патерн 'Адаптер':");
        OldSystem oldSystem = new OldSystemImpl();
        NewSystem adapter = new Adapter(oldSystem);
        adapter.newMethod();
        System.out.println();

        // 2. Міст (Bridge)
        System.out.println("Патерн 'Міст':");
        Device tv = new TV(new TVRemote());
        tv.turnOn();
        System.out.println();

        // 3. Компоновщик (Composite)
        System.out.println("Патерн 'Компоновщик':");
        Composite composite = new Composite();
        composite.addComponent(new Leaf("Leaf1"));
        composite.addComponent(new Leaf("Leaf2"));
        composite.showDetails();
        System.out.println();

        // 4. Декоратор (Decorator)
        System.out.println("Патерн 'Декоратор':");
        Notifier notifier = new EmailNotifier(new BasicNotifier());
        notifier.send();
        System.out.println();

        // 5. Фасад (Facade)
        System.out.println("Патерн 'Фасад':");
        Facade facade = new Facade();
        facade.simpleOperation();
        System.out.println();

        // 6. Легковаговик (Flyweight)
        System.out.println("Патерн 'Легковаговик':");
        Flyweight fw1 = FlyweightFactory.getFlyweight("shared");
        Flyweight fw2 = FlyweightFactory.getFlyweight("shared");
        fw1.operation();
        fw2.operation();
        System.out.println();

        // 7. Замісник (Proxy)
        System.out.println("Патерн 'Замісник':");
        Service proxy = new ProxyService();
        proxy.request();
        System.out.println();
    }
}