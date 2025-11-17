package quiz_3.utils;

import java.util.Scanner;

import quiz_3.models.InvalidInputException;

public class CLIUtil {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static String getString() {
        return scanner.nextLine();
    }

    public static int askForInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static double askForDouble(String message) throws InvalidInputException {
        getString();
        String input = askForString(message);
        Double inputDouble = Double.parseDouble(input);
        if (input == null) {
            throw new InvalidInputException("Input Not Valid!");
        }
        return inputDouble;
    }

    public static String askForString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
