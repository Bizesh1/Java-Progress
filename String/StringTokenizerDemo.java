import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        int count = 0;

        StringTokenizer st = new StringTokenizer(sentence);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            count++;
        }
        System.out.println("Total words: " + count);
        sc.close();
    }
}
