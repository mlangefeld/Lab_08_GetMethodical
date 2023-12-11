import java.util.Scanner;

import static java.lang.System.in;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String testString = SafeInput.getNonZeroLenStrings(in, "Enter anything, just dont leave this spot blank");
        System.out.println("You have entered: " + testString);

        System.out.println();

        int testInt = SafeInput.getInt(in, "Type any integer here");
        System.out.print("Your integer is " + testInt);

        System.out.println();
        System.out.println();

        double testDouble = SafeInput.getDouble(in, "Type any number here");
        System.out.print("Your number is " + testDouble);

        System.out.println();
        System.out.println();

        int testRangedInt = SafeInput.getRangedInt(in, "Enter a number", 10, 20);
        System.out.println("You entered " + testRangedInt);

        System.out.println();

        double testRangedDouble = SafeInput.getRangedDouble(in, "Enter a number", 10, 20);
        System.out.println("You entered " + testRangedDouble);

        System.out.println();
        System.out.println();

        boolean testYNConfirm = SafeInput.getYNConfirm(in, "Enter Y for true and N for false, [Y,N]: ");
        System.out.println("You entered " + testYNConfirm);

        System.out.println();
        System.out.println();

        String testRegEx = SafeInput.getRegExString(in, "Enter your name ", "^[A-Za-z]+([ '-][a-zA-Z]+)*" );
        System.out.println("Your name is " + testRegEx);


    }




}

