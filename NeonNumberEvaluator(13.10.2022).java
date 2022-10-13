import java.util.Scanner;

/**
 * Square the given number
 * and add the output of given number
 * then output is equal to given number
 * It is neon number.
 */
public class NeonNumberEvaluator {
    public static boolean checkNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            int numberReminder = square % 10;
            sum += numberReminder;
            square = square / 10;
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }      
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number to check Neon or not");
        int number = scanner.nextInt();

        if (checkNeon(number)) {
	    System.out.println("Given number " + number + " is Neon number");
	} else {
            System.out.println("Given number " + number + " is not a Neon number");
        }
    }
}
