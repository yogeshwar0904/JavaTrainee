import java.util.Scanner;


/**
 *The two digit or more than two digit number.that each 
 *number is to be cubed and add that cubed number if the 
 *number is as same as that initial number it is said to
 *Armstrong number.
 */ 
public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(); 
        armstrongNumber.checkArmstrongNumber();    
    }

    private int checkArmstrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to check Armstrong or not");
        int addNumber = 0;
        int number = scanner.nextInt();
        int temporaryNumber = number;

        while (temporaryNumber != 0) {
            int remainderNumber = temporaryNumber % 10;
            addNumber = addNumber + remainderNumber * remainderNumber 
                            * remainderNumber;
            temporaryNumber = temporaryNumber / 10;    
        }

        if (addNumber == number) {
            System.out.println(number + " = is a ArmstrongNumber ");
        } else {
            System.out.println(number + " = is not a ArmstrongNumber ");        
        }
        return number;
    }
}