package behavioral.Visitor;

public interface Element {
    void accept(Visitor visitor);
    String getName();
}
