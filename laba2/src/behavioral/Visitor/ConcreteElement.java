package behavioral.Visitor;

class ConcreteElement implements Element {
    private String name;

    public ConcreteElement(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
