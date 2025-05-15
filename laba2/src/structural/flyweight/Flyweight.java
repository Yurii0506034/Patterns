package structural.flyweight;

import java.util.*;

public class Flyweight {
    private String sharedState;

    public Flyweight(String sharedState) {
        this.sharedState = sharedState;
    }

    public void operation() {
        System.out.println("Operating with shared state: " + sharedState);
    }
}

