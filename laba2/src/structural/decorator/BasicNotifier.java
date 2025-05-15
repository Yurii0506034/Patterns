package structural.decorator;

public class BasicNotifier implements Notifier {
    public void send() {
        System.out.println("Sending basic notification");
    }
}
