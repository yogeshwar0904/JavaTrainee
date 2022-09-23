import java.util.Scanner;


/**
 *Every number should be the addition of
 *privious two number.
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int firstNumber = 0;
        int lastNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many fibonacci numbers to print");
        int number = scanner.nextInt();
        System.out.print("The Fibonacci numbers are ");
        System.out.print(firstNumber + " " + lastNumber);
        for(int index = 1; index <= number - 2; index++) {
            int fibonacciNumber = firstNumber + lastNumber;
            firstNumber = lastNumber;
            lastNumber = fibonacciNumber;
            System.out.print(" " + fibonacciNumber);
        }
    }
}