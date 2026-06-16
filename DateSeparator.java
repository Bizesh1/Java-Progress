import java.util.Scanner;
import java.util.StringTokenizer;

public class DateSeparator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (DD/MM/YY): ");
        String date = sc.nextLine();

        StringTokenizer st = new StringTokenizer(date, "/");

        String day = st.nextToken();
        String month = st.nextToken();
        String year = st.nextToken();

        System.out.println("Year  : " + year);
        System.out.println("Month : " + month);
        System.out.println("Day   : " + day);

        sc.close();
    }
}
