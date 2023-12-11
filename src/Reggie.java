import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String socialSecurity;
        String mNumber;
        String menuChoice;

        socialSecurity = SafeInput.getRegExString(in, "\nPlease enter your SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is " + socialSecurity);

        mNumber = SafeInput.getRegExString(in, "\nPlease enter your student ID M number: ", "^(M|m)\\d{8}$");
        System.out.println("Your M number is " + mNumber);

        menuChoice = SafeInput.getRegExString(in, "\nPlease choose to Open, Save, View, or Quit [O,S,V,Q] ", "^[OoSsVvQq]$");

        if (menuChoice.equalsIgnoreCase("o")){
            System.out.println("You have chosen to open");

        } else if (menuChoice.equalsIgnoreCase("s")) {
            System.out.println("You have chosen to save");

        } else if (menuChoice.equalsIgnoreCase("v")) {
            System.out.println("You have chosen to view");

        } else {
            System.out.println("You have chosen to quit");
        }

    }
}
