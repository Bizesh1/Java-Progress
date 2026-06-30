import java.util.Scanner;

public class CharacterCount {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int whitespace = 0;
        int special = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upper++;
            } else if (Character.isLowerCase(ch)){
                lower++;
            }else if (Character.isDigit(ch)){
                digit++;
            }else if (Character.isWhitespace(ch)){
                whitespace++;
            }else {
                special++;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digit: " + digit);
        System.out.println("Whitespace: " + whitespace);
        System.out.println("Special: " + special);

        sc.close();

    }
}
