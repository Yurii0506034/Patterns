package structural.bridge;

public class TV extends Device {
    public TV(Remote remote) {
        super(remote);
    }

    public void turnOn() {
        remote.power();
    }
}
