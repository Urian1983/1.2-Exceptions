package level2;

import level2.model.*;
import level2.exceptions.*;


public class InputTester {

    public static void main(String[] args) throws OutOfLimitsException, IncorrectCharException {

        try{
            Input input = new Input();
            menu(input);
        }
        catch (OutOfLimitsException e){
            System.err.println(e.getMessage());

        }

    }

    private static String textMenu () {
        return "\n=== INPUT TEST MENU ===\n" +
                "1. Test readInteger\n" +
                "2. Test readFloat\n" +
                "3. Test readByte\n" +
                "4. Test readDouble\n" +
                "5. Test readCorrectChar\n" +
                "6. Test readString\n" +
                "7. Test readString (with validation)\n" +
                "8. Test yesOrno\n" +
                "0. Exit\n";

    }

    public static void menu(Input input) throws OutOfLimitsException, IncorrectCharException {
        while(true){
            int optionMenu = input.readInteger(textMenu());
            switch (optionMenu) {
                case 1:
                    Input.readInteger("Type an integer number");
                    break;
                case 2:
                    Input.readFloat("Type a float number");
                    break;
                case 3:
                    Input.readByte("Type a byte number");
                    break;
                case 4:
                    Input.readDouble("Type a double number");
                    break;
                case 5:
                    Input.readCorrectChar("Type character 'a' ", 'a');
                    break;
                case 6:
                    Input.readString("Type a word");
                    break;
                case 7:
                    Input.readString("Type hello and press enter", "hello");
                    break;
                case 8:
                    Input.yesOrno("y/s or n? Choose one typing the correct letter");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    throw new OutOfLimitsException();
            }

        }


    }
}
