package creational.builder;

public class ProductBuilt {
    private final String partA;
    private final String partB;

    public ProductBuilt(String partA, String partB) {
        this.partA = partA;
        this.partB = partB;
    }

    public void show() {
        System.out.println("Built Product with: " + partA + " and " + partB);
    }
}
