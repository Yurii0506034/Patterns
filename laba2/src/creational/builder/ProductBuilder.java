package creational.builder;

public class ProductBuilder {
    private String partA;
    private String partB;

    public ProductBuilder setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public ProductBuilder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public ProductBuilt build() {
        return new ProductBuilt(partA, partB);
    }
}
