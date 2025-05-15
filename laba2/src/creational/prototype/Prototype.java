package creational.prototype;

public class Prototype implements Cloneable {
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
