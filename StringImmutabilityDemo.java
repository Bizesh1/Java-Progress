public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        System.out.println("Memory address of str before: " + System.identityHashCode(str));
        
        // Attempting to modify the string
        str.concat(" World");

        System.out.println("\nAfter concat() without assignment:");
        System.out.println("String: " + str); // str is unchanged
        System.out.println("Memory address of str after concat(): " + System.identityHashCode(str)); // same memory address
        
        // Reassigning the string variable
        str = str.concat(" World");

        System.out.println("\nAfter concat() with assignment:");
        System.out.println("String: " + str); // str now points to a new string
        System.out.println("Memory address of str after: " + System.identityHashCode(str)); // different memory address
    }
}
