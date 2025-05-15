package behavioral.Iterator;

class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int currentIndex = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < aggregate.getSize();
    }

    @Override
    public Object next() {
        return aggregate.getItem(currentIndex++);
    }
}
