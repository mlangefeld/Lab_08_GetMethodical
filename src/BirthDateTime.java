import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear;
        int birthMonth;
        int birthDay = 0;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in, "What year were you born in?", 1950, 2015);

        birthMonth = SafeInput.getRangedInt(in, "What month were you born in?", 1, 12);

        switch (birthMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in, "What day were you born on?", 1, 31);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "What day were you born on?", 1, 30);
                break;

            case 2:
                birthDay = SafeInput.getRangedInt(in, "What day were you born on?", 1, 29);

        }

        birthHour = SafeInput.getRangedInt(in, "What hour were you born on? (Military time)", 1, 24);

        birthMinute = SafeInput.getRangedInt(in, "What minute were you born on?", 1, 59);

        System.out.println("You were born " + birthMonth + "-" + birthDay + "-" + birthYear + " at " + birthHour + ":" + birthMinute);


    }
}
