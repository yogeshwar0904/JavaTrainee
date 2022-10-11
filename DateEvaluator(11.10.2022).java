import java.util.InputMismatchException;
import java.util.Scanner;


/** 
 * Check given date is 
 * valid or not.
 */
public class DateEvaluator {
    public static void main(String[] args) {
        isValidDate();
    }

    public static boolean isValidDate() {
        boolean isValid = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the date");
                int date = scanner.nextInt();
                System.out.println("Enter the month");
                int month = scanner.nextInt();
                System.out.println("Enter the year");
                int year = scanner.nextInt();

                if (date < 1 && date > 31 && month < 1 && month >12 && year == 0 ) {
                    System.out.println("The given date is invalid");
                } else if (month == 4 || month == 6 || month == 9 || month == 11 && date > 30) {
                    System.out.println("The given date is invalid");
                } else if (year % 100 != 0 && month == 2 && date < 30 && year % 4 == 0 || year % 400 ==0 ) {
                    System.out.println("The given date is valid and it is leap year");
                } else if (month == 2 && date > 28) {
                    System.out.println("The given date is invalid");
                } else {
                    System.out.println("The given date is valid");   
                }   
            } catch (InputMismatchException inputMismatch) {
                System.out.println("Entered wrong formate");
                isValid = true;
                isValidDate();
            }
            return true;
        } while (!isValid);                
    }
}