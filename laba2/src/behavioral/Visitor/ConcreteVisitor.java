package behavioral.Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("Visiting element: " + element.getName());
    }
}
