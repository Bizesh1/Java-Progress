final class Utility { //final class
    public static int square(int num) {
       return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }
}

class Bank { // Parent Class
    // final method
    public final double calInt(double amount){
        return amount * 0.08; // 8% interest
    }
}

class SBI extends Bank { // Child Class
    /*
    //Comiler Error: Cannot override the final method from Bank
    @Override
    public double calInt(double amount) {
        return amount * 0.10; // 10% interest
    }
    */
}

public class FinalDemo {
    public static void main(String[] args) {
        // Using Utility class methods
        final double PI = 3.14159; // final variable
        double radius = 7;
        double area = PI * radius * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Area of circle with radius " + radius + " is: " + area);
        SBI sb1 = new SBI();
        double amount = 1000;
        double interest = sb1.calInt(amount);
        System.out.println("\nAmount: " + amount);
        System.out.println("Interest: " + interest);    
        int num = 5;
        System.out.println("\nSquare of " + num + " is: " + Utility.square(num));
        System.out.println("Cube of " + num + " is: " + Utility.cube(num));
        
    }
}

