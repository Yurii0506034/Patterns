package structural.bridge;

public abstract class Device {
    protected Remote remote;

    protected Device(Remote remote) {
        this.remote = remote;
    }

    public abstract void turnOn();
}

interface Remote {
    void power();
}

