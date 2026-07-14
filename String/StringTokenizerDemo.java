import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int count = 0;

        StringTokenizer st = new StringTokenizer(sentence);

        ArrayList<String> words = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            count++;
            words.add(word);
        }

        System.out.println("\nWords in the sentence: ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nTotal words: " + count);
        sc.close();
    }
}
