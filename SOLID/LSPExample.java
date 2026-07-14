package SOLID;

class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();

        // This will throw an exception
        try {
            penguin.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        // This will work as expected
        sparrow.fly();
    }
}
