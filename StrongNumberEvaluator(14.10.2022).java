import java.util.Scanner;
 
public class StrongNumberEvaluator {
    public static void main(String args[]) {
        isStrongNumber();
    }

    public static void isStrongNumber() {
        int number;
        int realNumber;
        int temporaryNumber;
        int factorial;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scanner.nextInt();
        realNumber = number;

        while (number>0) {
            temporaryNumber = number % 10;
            factorial = 1;
            for(int index = 1; index <= temporaryNumber; index++){
                factorial = factorial * index;
            }
            sum =sum + factorial;
            number =number / 10;
        }
        if (sum == realNumber) {
            System.out.println(realNumber + " is STRONG NUMBER");
        } else {
            System.out.println(realNumber + " is not a STRONG NUMBER");
        }
    }
}