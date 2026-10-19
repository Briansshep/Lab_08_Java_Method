import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);

        int maxDay = 31;
        switch (month) {
            case 4, 6, 9, 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
            default:
                maxDay = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, maxDay);

        System.out.println("\nYour birth date is " + month + "/" + day + "/" + year);
    }
}
