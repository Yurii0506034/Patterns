package behavioral.Iterator;

class ConcreteAggregate implements Aggregate {
    private Object[] items;
    private int size = 0;

    public ConcreteAggregate(int capacity) {
        items = new Object[capacity];
    }

    public void addItem(Object item) {
        items[size++] = item;
    }

    public Object getItem(int index) {
        return items[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
