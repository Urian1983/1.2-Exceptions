package level2.model;

import java.util.InputMismatchException;
import java.util.Scanner;
import level2.exceptions.*;

public class Input {

    private static Scanner sc = new Scanner(System.in);

    public static int readInteger(String message) throws InputMismatchException {
        while (true) try {
            System.out.println(message);
            int integerToRead = sc.nextInt();
            sc.nextLine();
            return integerToRead;
        } catch (InputMismatchException e) {
            System.out.println("Error, you must type an Integer");
            sc.nextLine();
        }
    }
    public static float readFloat(String message) throws InputMismatchException {
        while(true) try {
             System.out.println(message);
             float FloatToRead = sc.nextFloat();
             sc.nextLine();
             return FloatToRead;
            } catch (InputMismatchException e) {
                System.out.println("Error, you must type a Float");
                sc.nextLine();
            }
    }

    public static byte readByte(String message) throws InputMismatchException {
        while(true) try {
            System.out.println(message);
            byte ByteToRead = sc.nextByte();
            sc.nextLine();
            return ByteToRead;
        } catch (InputMismatchException e) {
            System.out.println("Error, you must type a Byte");
            sc.nextLine();
        }
    }

    public static double readDouble(String message) throws InputMismatchException {
        while(true) try {
            System.out.println(message);
            double DoubleToRead = sc.nextDouble();
            sc.nextLine();
            return DoubleToRead;
        } catch (InputMismatchException e) {
            System.out.println("Error, you must type a Double");
            sc.nextLine();
        }
    }

    public static char readCorrectChar(String message, char correctChar) {
        while (true) {
            try {
                System.out.println(message);
                char possibleChar = sc.next().charAt(0);
                sc.nextLine();

                if (possibleChar == correctChar) {
                    return possibleChar;
                } else {
                    throw new IncorrectCharException();
                }

            } catch (IncorrectCharException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Please, enter a character");
                sc.nextLine();
            }
        }
    }

    public static String readString(String message){
        System.out.println(message);
        String stringtoReturn = sc.nextLine();
        return stringtoReturn;
    }

    public static String readString(String message, String correctString){
        while (true) {
            try {
                System.out.println(message);
                String possibleString = sc.nextLine();

                if (possibleString.equalsIgnoreCase(correctString)) {
                    return possibleString;
                } else {
                    throw new IncorrectStringException();
                }

            } catch (IncorrectStringException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Please, enter a character");
                sc.nextLine();
            }
        }
    }

    public static boolean yesOrno(String message) throws IncorrectCharException {
        while (true) {
            try {
                System.out.print(message + " (y/n): ");
                char option = sc.next().charAt(0);
                sc.nextLine();

                if (option == 'y' || option == 'Y') {
                    return true;
                } else if (option == 'n' || option == 'N') {
                    return false;
                } else {
                    throw new IncorrectCharException();
                }

            } catch (IncorrectCharException e) {
                System.err.println("Error: you must type 'y' or 'n'");
            }
        }
    }

}
