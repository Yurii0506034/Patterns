package structural.adapter;

public class Adapter implements NewSystem {
    private final OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override // Додано анотацію @Override
    public void newMethod() {
        oldSystem.oldMethod();
    }
}