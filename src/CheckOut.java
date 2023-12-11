import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double firstScan;
        double itemTotal = 0;
        boolean yesNo = true;

        while (yesNo == true){

            firstScan = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
            itemTotal = itemTotal + firstScan;

            yesNo = SafeInput.getYNConfirm(in, "would you like to continue scanning? [Y,N]: ");

        }

        System.out.printf("Your total is $%.2f", itemTotal);


    }
}
