package level2;

import java.util.InputMismatchException;
import java.util.Scanner;

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
}
