class Calculator {
    int add (int a, int b) {
        return a + b;
    }

    int add (int a, int b, int c) {
        return a + b + c;
    }

    double   add (double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main (String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(9,11));
        System.out.println("Addition of three integers: " + calc.add(9,11, 10));
        System.out.println("Addition of two doubles: " + calc.add(9.9,11.5));
    }
}
