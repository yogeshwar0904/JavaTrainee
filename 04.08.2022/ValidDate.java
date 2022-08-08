import java.util.Scanner;

public class ValidDate {

    static Scanner validDate = new Scanner(System.in);                                    /* Creating Scanner Object */

    public static void main(String[] args) {
        ValidDate valid = new ValidDate ();                                               // Create a object for method 
        valid.checkValid();                                                               // Here we access the method
    }

    public void checkValid () { 
                                                                                          /* Creating methode */
        System.out.println("enter the date you want");                                    // User enter the date here
        int date = validDate.nextInt();
        System.out.println("enter the month you want");                                   // User enter the month here
        int month = validDate.nextInt();
        System.out.println("enter the year you want");                                    // User enter the year here
        int year = validDate.nextInt();

        if (date > 31 || date < 1 || month > 12 || month < 1 ) {                          
            System.out.println("The date is invalid");
        } else if (month == 4 && month == 6 && month == 11 && month == 9 && date >30 ) {
            System.out.println("The date is invalid");
        } else if (month == 2 && date > 29) {
            System.out.println("The date is invalid");
        } else if (year % 100 != 0 && year % 4 != 0 && month != 2 && date >30 ) {
            System.out.println("the date is invalid");
        } else {
            System.out.println("The date is valid");
        }
    }
}