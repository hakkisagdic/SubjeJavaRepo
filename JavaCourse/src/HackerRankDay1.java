import java.util.*;

public class HackerRankDay1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int intValue;
        double doubleValue;
        String yazi = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /*intValue = scan.nextInt();
        doubleValue = scan.nextDouble();
        scan.nextLine();
        yazi = scan.nextLine();*/

        intValue = Integer.parseInt(scan.nextLine());
        doubleValue = Double.parseDouble(scan.nextLine());
        yazi = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(intValue + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(doubleValue + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.print(s + yazi);

        scan.close();
    }
}