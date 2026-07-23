package Exception_Handling;

public class ErrorExample {
    // A method that calls itself infinitely
    public static void crashMe() {
        // Line below causes recursive call with no exit
        crashMe();
    }

    public static void main(String[] args) {
        System.out.println("Starting the program...");
        try {
            //invoking the infinite recursive method
            crashMe();
        } catch (Exception e) {
            //THis block will not execute because the error is not an Exception, but an Error
            System.out.println("This will not catch the error because it is an Error, not an Exception.");
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
