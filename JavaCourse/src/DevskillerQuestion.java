import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

    /*
    Task description
    Introduction
    It is your first day at a new job as a Java engineer. You have been given a task
    to create simple utility which will help other engineers generate fake data for
    their tests.

    Problem statement
    In this task you have to implement all methods in the Faker class.

    This class is responsible for generating sequence of characters from given input,
    with given wildcard rules:

    letterify method should replace each question mark character (?) with any random lower a-z letter.
    numerify method should replace each hash character (#) with any random 0-9 number
    bothify method should do both above operations
    Good Luck!
    Hints
    Please pay attention to correctness but also to the quality of your solution.
     */

public class DevskillerQuestion {
    //1st way:
    char[] ALPHABET = {'a', 'b', 'c', 'd', '.'};
    //2nd way:
    final static int MINIMUM_NUMBER_ASCII = 48; //magic number, magic string
    final static int MAXIMUM_NUMBER_ASCII = 58; //57 last
    final static int MINIMUM_LOWERCASE_LETTER = 97;
    final static int MAXIMUM_LOWERCASE_LETTER = 123; //122 last

    public static int getRandomNumber(int selection) throws Exception { //1:letter, 2:number
        if (selection == 1)
            return ThreadLocalRandom.current().nextInt(MINIMUM_LOWERCASE_LETTER, MAXIMUM_LOWERCASE_LETTER);
        else if (selection == 2)
            return ThreadLocalRandom.current().nextInt(MINIMUM_NUMBER_ASCII, MAXIMUM_NUMBER_ASCII);
        else if (selection == 3)
            return 0;
        else
            throw new Exception("Choice is not supported");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write data for creation of fake data:");
        String input = scanner.nextLine();

        boolean wrongChoice = false;
        String result = "";

        do {
            System.out.println("Which operation do you need?");
            System.out.println("1:Letterify, 2:Numerify, 3:Both");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = letterify(input, choice);
                    break;
                case 2:
                    result = numerify(input, choice);
                    break;
                case 3:
                    result = bothify(input);
                    break;
                default:
                    System.out.println("Please choose between 1 - 3");
                    wrongChoice = true;
                    break;
            }
        } while (wrongChoice);

        System.out.println(result);
    }

    ///    letterify method should replace each question mark character (?) with any random lower a-z letter.
    public static String letterify(String value, int choice) throws Exception {
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            if (character == '?') {
                char randomCharacter = (char) getRandomNumber(choice);
                value = value.replaceFirst(Pattern.quote(String.valueOf(character)), String.valueOf(randomCharacter));
            }
        }

        return value;
    }

    ///    numerify method should replace each hash character (#) with any random 0-9 number
    public static String numerify(String value, int choice) throws Exception {
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            if (character == '#') {
                char randomCharacter = (char) getRandomNumber(choice);
                value = value.replaceFirst(Pattern.quote(String.valueOf(character)), String.valueOf(randomCharacter));
            }
        }

        return value;
    }

    //bothify method should do both above operations
    public static String bothify(String value) throws Exception {
        return numerify(letterify(value, 1), 2);
    }
}