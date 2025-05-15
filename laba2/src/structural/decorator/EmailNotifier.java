package structural.decorator;

public class EmailNotifier implements Notifier {
    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        notifier.send();
        System.out.println("Sending email notification");
    }
}
