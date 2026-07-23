package Exception_Handling;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int totalScore = 500;
        int totalPlayers = 0;

        try { 
            System.out.println("Calculating average score per player...");
            int averageScore = totalScore / totalPlayers; // This line will throw ArithmeticException
            System.out.println("Average score per player: " + averageScore);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. " + e.getMessage());
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}
