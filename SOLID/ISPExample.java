package SOLID;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionPrinter implements Printer, Scanner {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Basic Printer Printing.");
    }
}

public class ISPExample {
    public static void main (String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();

        BasicPrinter bp = new BasicPrinter();
        bp.print();
    }
}
