package structural.composite;

import java.util.*;

interface Component {
    void showDetails();
}

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Component: " + name);
    }
}

