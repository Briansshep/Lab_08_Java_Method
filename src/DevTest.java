import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Method A
        //String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        //System.out.println("You entered: " + name);

        // Method B
        //int anInt = SafeInput.getInt(in, "Enter an integer");
        //System.out.println("You entered: " + anInt);

        // Method C
        //double aDouble = SafeInput.getDouble(in, "Enter a double");
        //System.out.println("You entered: " + aDouble);

        // Method D
        //int rangedInt = SafeInput.getRangedInt(in, "Enter an int",1, 10);
        //System.out.println("You entered: " + rangedInt);

        // Method E
        //double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double", 1.5, 9.5);
        //System.out.println("You entered: " + rangedDouble);

        // Method F
        //boolean yes = SafeInput.getYNConfirm(in, "Are you liking school?");
        //System.out.println("You entered: " + yes);

        // Method G
        String code = SafeInput.getRegExString(in, "Enter a 3 digit code", "^\\d{3}$");
        System.out.println("You entered: " + code);


    }
}
